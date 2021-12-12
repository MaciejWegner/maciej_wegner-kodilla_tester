package com.kodilla.spring.basic.spring_configuration.homework;

public interface Car {

    boolean hasHeadlightsTurnedOn();

    String getCarType();

    public String toString();

}
//    Wewnątrz pakietu utwórz interfejs Car, zawierający metodę zwracającą boolean o nazwie hasHeadlightsTurnedOn.
//        Metoda powinna zwracać true lub false w zależności od tego, czy pojazd ma włączone światła.
//        Dodaj drugą metodę, getCarType(), zwracającą Stringa – typ samochodu.
//        Utwórz trzy klasy implementujące interfejs, np. SUV, Cabrio oraz Sedan.
//        W klasie konfiguracyjnej utwórz metodę, która będzie zwracać beana w zależności od pory roku.
//        Jeśli jest lato, chcemy jeździć kabrioletem, zimą SUV-em, wiosną i jesienią sedanem.
//        Ponadto, samochód powinien mieć włączone światła, jeśli godzina jest w zakresie 20:00 – 06:00.