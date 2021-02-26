package com.gustavo;

public class Heater {
    private int temperature;
    private int min, max, increment;

    public Heater(int minTemperature, int maxTemperature) {
        temperature = 15;
        min = minTemperature;
        max = maxTemperature;
        increment = 5;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public int getTemperature() {
        return temperature;
    }

    public void warmUp() {
        if(temperature + increment <= max)
            temperature += increment;
        else
            System.out.println("Temperatura máxima atingida, valor não atribuido");
    }

    public void cool() {
        if(temperature - increment >= min)
            temperature -= increment;
        else
            System.out.println("Temperatura mínima atingida, valor não atribuido");
    }
}
