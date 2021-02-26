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

    public int getTemperature() {
        return temperature;
    }

    public void warmUp() {
        temperature += increment;
    }

    public void cool() {
        temperature -= increment;
    }
}
