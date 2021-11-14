package com.kodilla.collections.adv.exercises.homework;

public class FlightApp {


    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        for (Flight flight : flightFinder.findFlightsFrom("Bydgoszcz")) {
            System.out.println(flight);
        }
        System.out.println("************");
        for (Flight flight : flightFinder.findFlightsFrom("Warszawa")) {
            System.out.println(flight);
        }
        System.out.println("************");
        for (Flight flight : flightFinder.findFlightsTo("Wrocław")) {
            System.out.println(flight);
        }
    }
}
//    Klasę Flight z polami String departure oraz String arrival.
//        Klasę FlightRepository z metodą statyczną getFlightsTable(), która zwraca listę lotów obsługiwanych przez dane lotnisko (wypełnij tę listę przykładowymi lotami).
//        Klasę FlightFinder z metodami:
//public List<Flight> findFlightsFrom(String departure)
//public List<Flight> findFlightsTo(String arrival)
//        Metody te będą wyszukiwały loty do oraz z podanego miasta.
//
//        Napisz testy do klasy FlightFinder.