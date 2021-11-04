package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Toyota();
        Car car2 = new Ford();
        Opel opel = new Opel();
        cars.add(car1);
        cars.add(car2);
        cars.add(opel);
        cars.add(car2);
        cars.add(car1);
        cars.add(car2);
        cars.add(opel);
        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("******************");// usuniecie z listy metodą remove index
        cars.remove(0);
        cars.remove(5);
        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("******************");
        cars.remove(opel);
        cars.remove(car1);
        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }
}

//Dodaj do niego klasę CarsListApplication z metodą main.
//        Wewnątrz metody main stwórz kolekcję samochodów (typu ArrayList), której typem elementów będzie dowolna klasa implementująca interfejs Car.
//        Dodaj do kolekcji kilka różnych samochodów i wyświetl w pętli for-each zawartość kolekcji, używając przygotowanej wcześniej metody describeCar z klasy CarUtils.
//        Usuń jeden z samochodów z kolekcji, używając do tego metody remove(int index).
//        Usuń jeden z samochodów z kolekcji, używając do tego metody remove(Object o).
//        Ponownie wyświetl zawartość kolekcji, a także informację o jej rozmiarze.
