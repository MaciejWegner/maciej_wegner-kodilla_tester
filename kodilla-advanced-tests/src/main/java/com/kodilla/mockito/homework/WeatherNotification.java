package com.kodilla.mockito.homework;

public class WeatherNotification {
    private int tempCelsius;

    public WeatherNotification(int tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    @Override
    public String toString() {
        return tempCelsius + "degress Celsius";
    }
}
