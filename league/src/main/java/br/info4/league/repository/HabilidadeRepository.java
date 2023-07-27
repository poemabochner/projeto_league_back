package br.info4.league.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.info4.league.model.Habilidade;

@Repository

public interface HabilidadeRepository extends JpaRepository <Habilidade, Long> {
    
}