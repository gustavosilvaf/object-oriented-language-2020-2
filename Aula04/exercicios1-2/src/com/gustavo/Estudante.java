package com.gustavo;

public class Estudante extends Pessoa{
    private String ra;

    public Estudante(String name, String ra) {
        super(name);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Ra: " + getRa());
    }
}
