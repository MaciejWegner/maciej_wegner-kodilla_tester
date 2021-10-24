package com.kodilla.inheritance.homework;

public class ApplicationOs {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2015, 2021);
        OverrideOs overrideOs = new OverrideOs(2015, 2020);

        overrideOs.displayYearOfPublication();

    }
}
