package com.kodilla.inheritance.homework;

public class OverrideOs extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("Operating System were turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Operating System were turned off");
    }

    public OverrideOs(int windows10, int windows11) {
        super(windows10, windows11 );
        System.out.println("Publication Years");
    }
}

