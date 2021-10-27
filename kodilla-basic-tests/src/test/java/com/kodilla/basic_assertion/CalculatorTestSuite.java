package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator1 = new Calculator();
        int c = 3;
        int d = 1;
        int subtractResult = calculator1.subtract(c, d);
        assertEquals(2, subtractResult);
    }

    @Test
    public void testExponentiation() {
        Calculator calculator2 = new Calculator();
        int e = 3;
        int f = 2;
               double exponentiationResult = calculator2.exponentiation(e, f);
        assertEquals(9, (int) exponentiationResult, 0.1);
    }
    @Test
    public void testWartosciUjemnePodstPot(){
        Calculator calculator = new Calculator();
        int a=-3;
        int b=2;
        double exponentiationResult = calculator.exponentiation(a, b);
        assertEquals(9, (int) exponentiationResult, 0.1);
    }
    @Test
    public void testWartosciUjemneWykladnikPot(){
        Calculator calculator = new Calculator();
        int a=3;
        int b=-2;
        double exponentiationResult = calculator.exponentiation(a, b);
        assertEquals(0, (int) exponentiationResult, 0.1);

    }
    @Test
    public void testWartosciUjemneWykladnikIPot(){
        Calculator calculator = new Calculator();
        int a=-3;
        int b=-2;
        double exponentiationResult = calculator.exponentiation(a, b);
        assertEquals(0, (int) exponentiationResult, 0.1);

    }
}


//import static java.lang.Math.*;
//    public void class Funkcje5{ public static void main(String[] args){
//        int a=5;
//        int b=2;
//        double potega=Math.pow(a,b);
//        double wart_bezwgl=Math.abs(a);
//        double pierwiastek=Math.sqrt(potega);
//        System.out.println=("Liczba a podniesiona do potegi b = "+potega);
//        System.out.println=("Wartosc bezwgledna z liczba a = "+wart_bezwgl);
//        System.out.println=("Pierwiastek liczby a podniesionej do potegi b = "+pierwiastek); }


//
//    Poprzednie testy (odejmowanie, potęgowanie) zrealizowane za pomocą instrukcji warunkowej
//    if/else, przepisz na wersję z wykorzystaniem testów jednostkowych. W trakcie potęgowania
//    uwzględnij przypadek liczby mniejszej od zera, zera i liczby większej od zera.
//
//        Aby wykonać to zadanie będziemy musieli porównać dwie zmienne typu double.
//        W tym celu należy wykorzystać metodę assertEquals przyjmującą
//        trzy argumenty: wartość oczekiwaną, wartość obliczoną oraz deltę.
//        W Javie operacje na liczbach zmiennoprzecinkowych są nieprecyzyjne.
//        Ze względu na to konieczne jest podanie delty – czyli dopuszczalnej różnicy między wartością
//        oczekiwaną, a otrzymaną.
//