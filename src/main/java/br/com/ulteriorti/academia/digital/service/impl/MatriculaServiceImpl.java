package br.com.ulteriorti.academia.digital.service.impl;

import br.com.ulteriorti.academia.digital.entity.Aluno;
import br.com.ulteriorti.academia.digital.entity.Matricula;
import br.com.ulteriorti.academia.digital.entity.form.MatriculaForm;
import br.com.ulteriorti.academia.digital.repository.AlunoRepository;
import br.com.ulteriorti.academia.digital.repository.MatriculaRepository;
import br.com.ulteriorti.academia.digital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatriculaServiceImpl implements IMatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }
    @Override
    public List<Matricula> getAll(String bairro) {
        if(bairro == null)
            return matriculaRepository.findAll();
        return matriculaRepository.findByAlunoBairro(bairro);
    }
    @Override
    public void delete(Long id) {

    }
}
