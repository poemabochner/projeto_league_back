package br.info4.league.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.info4.league.model.Usuario;
import br.info4.league.dto.CriarUsuarioDTO;
import br.info4.league.dto.UsuarioDTO;
import br.info4.league.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	BCryptPasswordEncoder encoder;

	public List<UsuarioDTO> findAll() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		List<UsuarioDTO> usuarioDTOs = new ArrayList<>();
		for (Usuario usuario : usuarios) {
			usuarioDTOs.add(new UsuarioDTO(usuario));
		}
		return usuarioDTOs;
	}

	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Transactional
	public UsuarioDTO inserir(CriarUsuarioDTO user) throws Exception {
		if (!user.getSenhaUsuario().equalsIgnoreCase(user.getConfirmaSenha())) {
			throw new Exception("Senha e Confirma Senha não são iguais");
		}
		if (usuarioRepository.findByNomeUsuario(user.getNomeUsuario()) != null) {
			System.out.println(user.getNomeUsuario());
			throw new Exception("Usuário já existente");
		}
		Usuario usuario = new Usuario();
		usuario.setNomeUsuario(user.getNomeUsuario());
		usuario.setSenhaUsuario(encoder.encode(user.getSenhaUsuario()));
		usuario = usuarioRepository.save(usuario);
		return new UsuarioDTO(usuario);
	}

	public UsuarioDTO findById(Long idUsuario) throws Exception {
		if (usuarioRepository.findById(idUsuario).isPresent()) {
			UsuarioDTO usuarioDTO = new UsuarioDTO(usuarioRepository.findById(idUsuario).get());
			return usuarioDTO;
		}
		throw new Exception("Usuário não encontrado!");
	}

}