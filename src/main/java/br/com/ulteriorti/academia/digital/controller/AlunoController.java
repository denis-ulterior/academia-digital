package br.com.ulteriorti.academia.digital.controller;

import br.com.ulteriorti.academia.digital.entity.Aluno;
import br.com.ulteriorti.academia.digital.entity.AvaliacaoFisica;
import br.com.ulteriorti.academia.digital.entity.form.AlunoForm;
import br.com.ulteriorti.academia.digital.service.impl.IAlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private IAlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }
    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaById(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaById(id);
    }
}
