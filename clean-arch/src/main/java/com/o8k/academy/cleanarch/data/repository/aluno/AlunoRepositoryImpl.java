package com.o8k.academy.cleanarch.data.repository.aluno;

import com.o8k.academy.cleanarch.domain.contract.AlunoRepository;
import com.o8k.academy.cleanarch.domain.entity.Aluno;
import com.o8k.academy.cleanarch.web.converter.AlunoRequestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {
    private AlunoDAO alunoDAO;
    private AlunoRequestConverter alunoRequestConverter;
    @Autowired
    public AlunoRepositoryImpl(AlunoDAO alunoDAO, AlunoRequestConverter alunoRequestConverter) {
        this.alunoDAO = alunoDAO;
        this.alunoRequestConverter = alunoRequestConverter;
    }

    @Override
    public void save(Aluno aluno) {
        AlunoEntity alunoEntity = AlunoEntity.from(aluno);
        alunoDAO.save(alunoEntity);
    }
}