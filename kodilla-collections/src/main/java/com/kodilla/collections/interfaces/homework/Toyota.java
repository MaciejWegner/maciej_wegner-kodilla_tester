package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{
    public int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed+=20;

    }

    @Override
    public void decreaseSpeed() {
speed-=10;
    }
}
