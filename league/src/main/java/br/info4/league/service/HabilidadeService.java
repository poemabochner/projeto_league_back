package br.info4.league.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.info4.league.model.Habilidade;
import br.info4.league.repository.HabilidadeRepository;

@Service

public class HabilidadeService {
    @Autowired 
    private HabilidadeRepository habilidadeRepository;

    public List<Habilidade> obterTodos() {
        return habilidadeRepository.findAll();
    }

    public Habilidade buscaPorId(Long id) {
        Optional<Habilidade> habilidade = habilidadeRepository.findById(id);

        return habilidade.get();
    }
}
