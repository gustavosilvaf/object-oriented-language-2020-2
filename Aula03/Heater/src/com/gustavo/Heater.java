package com.gustavo;

public class Heater {
    private int temperature;

    public Heater() {
        temperature = 15;
    }

    public int getTemperature() {
        return temperature;
    }

    public void warmUp() {
        temperature += 5;
    }

    public void cool() {
        temperature -= 5;
    }
}
