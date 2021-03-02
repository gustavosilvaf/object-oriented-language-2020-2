package com.gustavo;

public class Main {

    public static void main(String[] args) {
	    //exercicio 4
        Amplificador amp = new Amplificador(new Pedal(), new Guitarra());
        amp.reproduzirSom();

        System.out.println();

        //exercicio 6
        amp.setP(new WahWah());
        amp.reproduzirSom();

        System.out.println();

        amp.setP(new Vibrato());
        amp.reproduzirSom();

        System.out.println();

        //exercicio 8

        amp.setP(new PedalAnimal());
        amp.reproduzirSom();
    }
}
