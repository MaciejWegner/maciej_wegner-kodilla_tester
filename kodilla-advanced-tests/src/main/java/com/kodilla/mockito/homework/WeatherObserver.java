package com.kodilla.mockito.homework;

public interface WeatherObserver {

    void update(WeatherNotification weatherNotification);

    void receiveNotification(String notification);
}