package com.kodilla.mockito.homework;

import java.util.Objects;

public class Subscriber implements WeatherObserver {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(WeatherNotification weatherNotification) {
        System.out.println(name + ": in your city today will be" + weatherNotification);
    }

    @Override
    public void receiveNotification(String notification) {
        System.out.println(name + " : important information for you: " + notification);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}