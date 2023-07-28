package br.info4.league.repository;

import br.info4.league.model.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    Usuario findByNomeUsuario(String nomeUsuario);
    Optional<Usuario> findById(Long idUsuario);
}
