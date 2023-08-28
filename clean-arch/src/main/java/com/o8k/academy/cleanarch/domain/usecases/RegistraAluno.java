package com.o8k.academy.cleanarch.domain.usecases;

import com.o8k.academy.cleanarch.domain.contract.AlunoRepository;
import com.o8k.academy.cleanarch.domain.contract.RegistraAlunoBorda;
import com.o8k.academy.cleanarch.domain.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistraAluno implements RegistraAlunoBorda {
    private AlunoRepository alunoRepository;
    @Autowired
    public RegistraAluno(AlunoRepository alunoRepository) {

        this.alunoRepository = alunoRepository;
    }

    @Override
    public void save(Aluno aluno) {
        aluno.generateRegistrationNumber();
        alunoRepository.save(aluno);
    }
}