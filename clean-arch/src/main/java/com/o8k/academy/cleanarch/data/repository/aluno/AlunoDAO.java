package com.o8k.academy.cleanarch.data.repository.aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoDAO extends JpaRepository<AlunoEntity, Long> {
}