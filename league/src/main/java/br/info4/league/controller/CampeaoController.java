package br.info4.league.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.info4.league.model.Campeao;
import br.info4.league.service.CampeaoService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/campeao")

public class CampeaoController {
     @Autowired 
    private CampeaoService campeaoService;

    @GetMapping("/todos")
    public ResponseEntity<List<Campeao>> obterTodos() {
        List<Campeao> campeaos = campeaoService.obterTodos();
        return ResponseEntity.ok(campeaos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Campeao> buscarCampeao(@PathVariable Long id) {
        Campeao campeao = campeaoService.buscaPorId(id);
        return ResponseEntity.ok(campeao);
    }

}