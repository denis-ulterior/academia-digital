package br.com.ulteriorti.academia.digital.controller;

import br.com.ulteriorti.academia.digital.entity.Matricula;
import br.com.ulteriorti.academia.digital.entity.form.MatriculaForm;
import br.com.ulteriorti.academia.digital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(){
        return service.getAll();
    }
}
