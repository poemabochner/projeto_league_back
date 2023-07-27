package br.info4.league.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.info4.league.model.Habilidade;

public interface HabilidadeRepository extends JpaRepository <Habilidade, Long> {
    
}