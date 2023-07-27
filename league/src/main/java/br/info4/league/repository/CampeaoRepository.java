package br.info4.league.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.info4.league.model.Campeao;

public interface CampeaoRepository extends JpaRepository <Campeao, Long> {
    
}
