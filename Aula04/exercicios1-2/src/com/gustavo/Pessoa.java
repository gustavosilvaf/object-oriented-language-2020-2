package com.gustavo;

public class Pessoa {
    protected String name;

    public Pessoa (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void imprimir() {
        System.out.println("Nome da pessoa: " + getName());
    }
}
