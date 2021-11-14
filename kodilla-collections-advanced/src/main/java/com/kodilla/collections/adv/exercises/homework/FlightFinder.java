package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    private List<Flight> flights = FlightRepository.getFlightsTable();

    public List<Flight> findFlightsFrom(String departure) { // metoda wyszukująca przyloty z
        List<Flight> resultFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equalsIgnoreCase(departure)) {
                resultFlights.add(flight);
            }
        }
        return resultFlights;
    }

    public List<Flight> findFlightsTo(String arrival) { // metoda wyszukująca odloty do
        List<Flight> resultFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equalsIgnoreCase(arrival)) {
                resultFlights.add(flight);
            }
        }
        return resultFlights;
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