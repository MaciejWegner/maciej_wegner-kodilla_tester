package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
   public int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed+=16;

    }

    @Override
    public void decreaseSpeed() {
        speed-=17;

    }
}
