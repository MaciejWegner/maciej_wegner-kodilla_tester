package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    //metoda statyczna getFlightsTable(), która zwraca listę lotów obsługiwanych przez dane lotnisko
    //(wypełnij tę listę przykładowymi lotami)
    public static List<Flight> getFlightsTable(){
        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Warszawa", "Wrocław"));
        flightsTable.add(new Flight("Bydgoszcz", "Wrocław"));
        flightsTable.add(new Flight("Warszawa", "Szczecin"));
        flightsTable.add(new Flight("Warszawa", "Poznań"));
        return flightsTable;
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