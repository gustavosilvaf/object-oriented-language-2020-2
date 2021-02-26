package com.gustavo;

public class Main {

    public static void main(String[] args) {
        Heater h1 = new Heater(0, 20);

        System.out.println(h1.getTemperature());
        h1.cool();
        System.out.println(h1.getTemperature());
        h1.warmUp();
        h1.warmUp();
        System.out.println(h1.getTemperature());
        h1.warmUp();
        System.out.println(h1.getTemperature());

        System.out.println();

        Heater h2 = new Heater(0, 20);
        System.out.println(h2.getTemperature());
        h2.warmUp();
        System.out.println(h2.getTemperature());
        h2.warmUp();
        System.out.println(h2.getTemperature());
        h2.setIncrement(10);
        h2.cool();
        System.out.println(h2.getTemperature());
        h2.cool();
        System.out.println(h2.getTemperature());
        h2.cool();
        System.out.println(h2.getTemperature());

    }
}
