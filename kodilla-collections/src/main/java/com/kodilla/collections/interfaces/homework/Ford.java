package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    public int speed;


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed+=22;

    }

    @Override
    public void decreaseSpeed() {
speed-=13;
    }
}
