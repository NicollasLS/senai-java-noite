package com.escola.senai.service;

import com.escola.senai.Interface.AlunoRepository;
import com.escola.senai.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService (AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> ListaDeTodosAlunos(){
        return repository.findAll();
    }
public Aluno salvarNovoAluno (Aluno aluno) {
        return repository.save(aluno);
}
public void excluirAluno (Long id){
        repository.deleteById(id);
}
public Aluno buscarPorId (Long id){
        return repository.findById(id).orElse(null);

    }
}
