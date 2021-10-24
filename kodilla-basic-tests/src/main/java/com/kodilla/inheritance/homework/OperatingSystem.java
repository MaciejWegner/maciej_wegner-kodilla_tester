package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int Windows10;
    private int Windows11;


    public OperatingSystem(int Windows10, int Windows11) {
        this.Windows10 = Windows10;
        this.Windows11 = Windows11;

    }

    public void turnOn() {
        System.out.println("System were turned on");
    }

    public void turnOff() {
        System.out.println("System were turned off");
    }

    public void displayYearOfPublication() {
        System.out.println("Years publication is:" + Windows10 + " " + Windows11);
    }}

//        public int getWindows11(){
//            return Windows11;
//        }
//        public int getWindows10(){
//            return Windows10;
//        }
//}
// }
//}
//    Aby przećwiczyć i utrwalić wiedzę z zakresu dziedziczenia, wykonaj poniższe zadanie:
//
//        W nowym pakiecie com.kodilla.inheritance.homework utwórz klasę OperatingSystem.V
//        Utwórz metody turnOn(), turnOff() oraz konstruktor przyjmujący rok wydania danego systemu operacyjnego.
//        Następnie dodaj dwie klasy dziedziczące po OperatingSystem nadpisujące metody z klasy wyżej. Utwórz osobną klasę, w której zaprezentujesz działanie Twojego kodu.