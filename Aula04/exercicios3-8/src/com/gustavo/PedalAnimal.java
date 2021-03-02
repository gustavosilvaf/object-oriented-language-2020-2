package com.gustavo;

public class PedalAnimal extends Pedal{
    private Vibrato v = new Vibrato();
    private WahWah w = new WahWah();

    @Override
    public void aplicaEfeito() {
        System.out.println("[inicio do efeito animal]");
        w.aplicaEfeito();
        v.aplicaEfeito();
        System.out.println("[fim do efeito animal]");
    }
}
