package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("stamp1",1,1,true));
        stamps.add(new Stamp("stamp2",2,1,true));
        stamps.add(new Stamp("stamp1",1,1,true));
        stamps.add(new Stamp("stamp3",2,2,false));
        stamps.add(new Stamp("stamp4",3,1,false));
        stamps.add(new Stamp("stamp1",1,1,true));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }

    }
}

//package com.kodilla.collections.sets;
//
//        import java.util.HashSet;
//        import java.util.Set;
//
//public class OrderApplication {
//    public static void main(String[] args) {
//        Set<Order> orders = new HashSet<>();
//        orders.add(new Order("1/2019", "Iron", 1.0));
//        orders.add(new Order("2/2019", "Cutlery", 6.0));
//        orders.add(new Order("3/2019", "Chair", 2.0));
//        orders.add(new Order("1/2019", "Iron", 1.0));
//        System.out.println(orders.size());
//        for (Order order : orders)
//            System.out.println(order);
//    }
//}

//    Utwórz w nim klasę StampsApplication z metodą main. Będziemy w niej tworzyli kolekcję znaczków pocztowych. Jeżeli jakiś znaczek posiadamy w kilku egzemplarzach, to chcemy, aby w naszym obiekcie kolekcji wystąpił tylko raz.
//        Utwórz klasę Stamp reprezentującą znaczek pocztowy. Klasa powinna mieć pola na nazwę oraz wymiary znaczka, a także informację o tym, czy znaczek jest ostemplowany czy nie.
//        Wewnątrz metody main stwórz kolekcję znaczków (typu HashSet).
//        Sprawdź, czy do kolekcji nie da się dodać kilka razy takiego samego znaczka.