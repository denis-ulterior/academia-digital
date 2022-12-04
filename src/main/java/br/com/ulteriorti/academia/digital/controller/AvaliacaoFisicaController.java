package br.com.ulteriorti.academia.digital.controller;

import br.com.ulteriorti.academia.digital.entity.AvaliacaoFisica;
import br.com.ulteriorti.academia.digital.entity.form.AvaliacaoFisicaForm;
import br.com.ulteriorti.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }
}
