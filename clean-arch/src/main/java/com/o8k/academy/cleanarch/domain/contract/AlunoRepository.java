package com.o8k.academy.cleanarch.domain.contract;

import com.o8k.academy.cleanarch.domain.entity.Aluno;

public interface AlunoRepository {
    void save(Aluno aluno);
}