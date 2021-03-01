package com.gustavo;

public class Trabalhador extends Pessoa{

    private String ctps;

    public Trabalhador(String name, String ctps) {
        super(name);
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CTPS: " + getCtps());
    }
}
