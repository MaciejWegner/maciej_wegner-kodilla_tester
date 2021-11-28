package com.kodilla.mockito.homework;

public class Launcher {

    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();
        Subscriber subscriber = new Subscriber("Adam");
        Subscriber subscriber1 = new Subscriber("Paweł");
        weatherService.addObserver("Warszawa", subscriber);
        weatherService.addObserver("Warszawa", subscriber1);
        System.out.println(weatherService.getWeatherObserversMap().get("Warszawa").size());


    }
}