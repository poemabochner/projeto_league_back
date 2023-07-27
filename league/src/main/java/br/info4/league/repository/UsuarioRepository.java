package br.info4.league.repository;

import br.info4.league.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    
}
