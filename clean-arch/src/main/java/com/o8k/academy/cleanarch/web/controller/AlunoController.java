package com.o8k.academy.cleanarch.web.controller;

import com.o8k.academy.cleanarch.domain.contract.RegistraAlunoBorda;
import com.o8k.academy.cleanarch.domain.entity.Aluno;
import com.o8k.academy.cleanarch.web.converter.AlunoRequestConverter;
import com.o8k.academy.cleanarch.web.request.AlunoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    private RegistraAlunoBorda registraAlunoBorda;

    @Autowired
    public AlunoController(RegistraAlunoBorda registraAlunoBorda) {
        this.registraAlunoBorda = registraAlunoBorda;
    }

    @PostMapping
    public void save(@RequestBody AlunoRequest alunoRequest) {
        Aluno aluno = Aluno.from(alunoRequest.name);
        registraAlunoBorda.save(aluno);
    }
}
