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

    public List<Aluno> ListarTodos(){
        return repository.findAll();
    }
public Aluno salvar (Aluno aluno) {
        return repository.save(aluno);
}
public void deletar (Long id){
        repository.deleteAllById(id);
}
public Aluno buscarPorId (Long id){
        return repository.findById(id).orElse(null);
    }
}
