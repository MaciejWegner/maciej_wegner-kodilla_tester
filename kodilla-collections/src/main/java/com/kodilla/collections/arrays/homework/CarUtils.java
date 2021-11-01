package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {
    public static void describeCar(Car car){
        if (car instanceof Toyota)
            System.out.println("Toyota");
        else if (car instanceof Opel)
        System.out.println("Opel");
        else if (car instanceof Ford)
        System.out.println("Ford");
        else System.out.println("Nie ma takiego samochodu");
    }
}
//    Stwórz nowy pakiet com.kodilla.collections.arrays.homework, a w nim:
//
//        Klasę CarUtils z metodą statyczną opisującą samochody (patrz poprzednie zadanie) o nazwie
//public static void describeCar(Car car).
//        Klasę CarsApplication z metodą public static Car drawCar(),
//        która będzie tworzyła losowy samochód z losowo zwiększoną prędkością.
//        Metodę main, w której znajdzie się tablica o losowym rozmiarze
//        od 1 do 15 samochodów.  Do każdego elementu tablicy wpisz wylosowany przy pomocy metody drawCar samochód,
//        a następnie przy pomocy pętli wyświetl informacje o wszystkich samochodach znajdujących się w tablicy.