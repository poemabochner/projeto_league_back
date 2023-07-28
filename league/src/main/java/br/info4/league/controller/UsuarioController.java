package br.info4.league.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.info4.league.dto.CriarUsuarioDTO;
import br.info4.league.dto.UsuarioDTO;
import br.info4.league.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;

	@GetMapping
	
	public ResponseEntity<List<UsuarioDTO>> listar() {
		return ResponseEntity.ok(usuarioService.findAll());
	}

	@PostMapping
	
	public ResponseEntity<UsuarioDTO> inserir(@RequestBody CriarUsuarioDTO usuario) throws Exception {
		UsuarioDTO usuarioCadastro = usuarioService.inserir(usuario);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuarioCadastro.getIdUsuario())
				.toUri();
		return ResponseEntity.created(uri).body(usuarioCadastro);
	}

}
