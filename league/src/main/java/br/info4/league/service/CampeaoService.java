package br.info4.league.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.info4.league.model.Campeao;
import br.info4.league.repository.CampeaoRepository;

@Service

public class CampeaoService {
    @Autowired 
    private CampeaoRepository campeaoRepository;

    public List<Campeao> obterTodos() {
        return campeaoRepository.findAll();
    }

    public Campeao buscaPorId(Long id) {
        Optional<Campeao> campeao = campeaoRepository.findById(id);

        return campeao.get();
    }
}

