package com.o8k.academy.cleanarch.data.repository.aluno;

import com.o8k.academy.cleanarch.domain.entity.Aluno;
import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name = "ALUNO")
public class AlunoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private UUID registrationNumber;
    public static AlunoEntity from(Aluno aluno){
        var alunoEntity = new AlunoEntity();
        alunoEntity.name = aluno.getName();
        alunoEntity.registrationNumber = aluno.getRegistrationNumber();
        return alunoEntity;
    }
}