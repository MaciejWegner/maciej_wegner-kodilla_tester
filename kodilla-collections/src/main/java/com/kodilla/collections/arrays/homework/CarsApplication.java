package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    static Random random = new Random();

    public static Car drawCar() {
        int drawnCar = random.nextInt(3);
        int speedCar = random.nextInt(250);
        Car car;
        if (drawnCar == 0) {
            Toyota toyota = new Toyota();
            toyota.speed += speedCar;
            return toyota;
        } else if (drawnCar == 1) {
            Opel opel = new Opel();
            opel.speed += speedCar;
            return opel;
        } else  {
            Ford ford = new Ford();
            ford.speed += speedCar;
            return ford;
        }
        //return car;
    }
    public static Car[] creatingCarArray() {
        Car[] carArray = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < carArray.length; i++) {
            carArray[i] = drawCar();
        }
        return carArray;
    }

    public static void main(String[] args) {
        Car[] cars = creatingCarArray();
        showCars(cars);
    }

    public static void showCars(Car[] cars) {
        int wielkoscTablicy = cars.length;
        System.out.println("Losowana wielkość tablicy: " + wielkoscTablicy);
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            CarUtils.describeCar(car);
            System.out.println("Prędkość samochodu: " + car.getSpeed());
        }
    }

}

//    Stwórz nowy pakiet com.kodilla.collections.arrays.homework, a w nim:
//
//        Klasę CarUtils z metodą statyczną opisującą samochody (patrz poprzednie zadanie) o nazwie
//public static void describeCar(Car car). done
//        Klasę CarsApplication z metodą public static Car drawCar(),
//        która będzie tworzyła losowy samochód z losowo zwiększoną prędkością.done
//        Metodę main, w której znajdzie się tablica o losowym rozmiarze
//        od 1 do 15 samochodów.  Do każdego elementu tablicy wpisz wylosowany przy pomocy metody drawCar samochód,
//        a następnie przy pomocy pętli wyświetl informacje o wszystkich samochodach znajdujących się w tablicy.
