package com.escola.senai.Controller;

import com.escola.senai.model.Aluno;
import com.escola.senai.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> ListarAlunos() {
        return service.ListaDeTodosAlunos();
    }

    @PostMapping
    public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
        return service.salvarNovoAluno(aluno);
    }

    @GetMapping("/{id}")
    public Aluno buscarAlunoPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public Void deletarAlunoPor(@PathVariable Long id) {
        service.excluirAluno(id);
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno (@PathVariable Long id, @RequestBody Aluno aluno) {
        Aluno existe = service.buscarPorId(id);
        if (existe == null) return null;




}