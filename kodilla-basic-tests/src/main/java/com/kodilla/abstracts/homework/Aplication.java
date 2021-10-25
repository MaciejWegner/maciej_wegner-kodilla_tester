package com.kodilla.abstracts.homework;

public class Aplication {
    public static void main(String[] args) {
        Shape kolo = new Kolo();
        Shape kwadrat = new Kwadrat();

        System.out.println("Kolo" + " " + "powierzchnia" + " " + kolo.getPolePowierzchni()+ " " + "Obwod" + " " + kolo.getObwod()
                + " " +"Kwadrat" + " " + "powierzchnia" + " " + kwadrat.getPolePowierzchni()+ " "+"Obwod" + " " + kwadrat.getObwod());
    }
}
