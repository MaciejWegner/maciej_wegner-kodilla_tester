package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int PolePowierzchni;
    private int Obwod;

    public Shape(int PolePowierzchni, int Obwod) {

        this.PolePowierzchni = PolePowierzchni;
        this.Obwod = Obwod;
    }


    public int getPolePowierzchni() {
        return PolePowierzchni;
    }

    public int getObwod() {
        return Obwod;
    }

}

//    Utwórz nowy pakiet com.kodilla.abstracts.homework. W tym pakiecie:
//
//        Utwórz abstrakcyjną klasę Shape z dwiema abstrakcyjnymi metodami obliczającym pole powierzchni i obwód. Utwórz trzy klasy dziedziczące po klasie Shape wraz z wymaganą implementacją. Działanie zaprezentuj w klasie Application.
//
//        Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities. Utwórz kilka konkretnych zawodów (klas dziedziczących po Job). W kolejnym kroku utwórz klasę Person, która zawierać będzie pola firstName, age i job. Dodaj metodę, która wyświetli obowiązki danej osoby w pracy.
//        Gotowy kod prześlij do repozytorium, wklej link poniżej i wyślij do Mentora.