package br.info4.league.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.info4.league.model.Habilidade;
import br.info4.league.service.HabilidadeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/habilidade")

public class HabilidadeController {
     @Autowired 
    private HabilidadeService habilidadeService;

    @GetMapping("/todos")
    public ResponseEntity<List<Habilidade>> obterTodos() {
        List<Habilidade> habilidades = habilidadeService.obterTodos();
        return ResponseEntity.ok(habilidades);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Habilidade> buscarHabilidade(@PathVariable Long id) {
        Habilidade habilidade = habilidadeService.buscaPorId(id);
        return ResponseEntity.ok(habilidade);
    }

}
