package com.kodilla.inheritance.homework;

public class ApplicationOs {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2015, 2021);
        OverrideOs overrideos = new OverrideOs(2015, 2021);

        OperatingSystem.displayYearOfPublication();

    }
}
