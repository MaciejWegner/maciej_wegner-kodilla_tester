package com.kodilla.abstracts;

public abstract class Animal {

    private int numberOfLegs;

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
       // numberOfLegs=4;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public abstract void giveVoice();
}