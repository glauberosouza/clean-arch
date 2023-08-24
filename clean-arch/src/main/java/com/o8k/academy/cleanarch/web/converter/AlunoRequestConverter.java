package com.o8k.academy.cleanarch.web.converter;

import com.o8k.academy.cleanarch.domain.entity.Aluno;
import com.o8k.academy.cleanarch.web.request.AlunoRequest;
import org.springframework.stereotype.Component;

@Component
public class AlunoRequestConverter {
    public Aluno toAluno(AlunoRequest alunoRequest) {
        return Aluno.from(alunoRequest.name);
    }
}