package br.com.ulteriorti.academia.digital.service.impl;

import br.com.ulteriorti.academia.digital.entity.Aluno;
import br.com.ulteriorti.academia.digital.entity.form.AlunoForm;
import br.com.ulteriorti.academia.digital.entity.form.AlunoUpdateForm;
import br.com.ulteriorti.academia.digital.repository.AlunoRepository;
import br.com.ulteriorti.academia.digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAlunoServiceImpl implements IAlunoService {
    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
        return repository.save(aluno);

    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
