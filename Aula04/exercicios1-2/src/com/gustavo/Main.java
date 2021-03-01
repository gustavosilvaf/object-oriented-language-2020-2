package com.gustavo;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Fulano");
        p1.imprimir();

        Estudante e1 = new Estudante("Ciclano", "1234");
        e1.imprimir();

        Trabalhador t1 = new Trabalhador("Beltrano", "4321");
        t1.imprimir();

    }
}
