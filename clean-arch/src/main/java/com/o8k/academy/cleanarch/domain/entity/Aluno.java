package com.o8k.academy.cleanarch.domain.entity;

import java.util.UUID;

public class Aluno {
    private String name;
    private UUID registrationNumber;

    public static Aluno from(String name) {
        var aluno = new Aluno();
        aluno.name = name;
        return aluno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getRegistrationNumber() {
        return registrationNumber;
    }

    public void generateRegistrationNumber() {
        this.registrationNumber = UUID.randomUUID();
    }
}