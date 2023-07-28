package br.info4.league.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.info4.league.model.Usuario;
import br.info4.league.repository.UsuarioRepository;
import br.info4.league.security.UsuarioDetalhe;

@Service
public class UsuarioDetalheImpl implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByNomeUsuario(username);
        if (usuario == null) {
            throw new RuntimeException();
        }
        return new UsuarioDetalhe(usuario);
    }
}