package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        Calculator calculator1 = new Calculator();
        int c = 3;
        int d = 1;
        int subtractResult = calculator1.subtract(c, d);
        boolean correct1 = ResultChecker.assertEquals(2, subtractResult);
        if (correct1) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + c + " i " + d);
        }
        Calculator calculator2 = new Calculator();
        int e = 3;
        int f = 2;

        double exponentiationResult = calculator2.exponentiation(e, f);
        boolean correct2 = ResultChecker.assertEquals(9, (int) exponentiationResult);
        if (correct2) {
            System.out.println("Metoda exponentiation działa poprawnie dla liczb " + e + " do potęgi " + f);
        } else {
            System.out.println("Metoda exponentiation nie działa poprawnie dla liczb " + e + " do potegi " + f);
        }
    }
}
//    Aby utrwalić tę wiedzę, wykonaj samodzielnie krótkie zadanie:
//
//        W metodzie main dodaj test dla metody odejmującej liczby.
//        W klasie Calculator dodaj metodę podnoszącą liczbę do kwadratu. Utwórz dla niej test w metodzie main.