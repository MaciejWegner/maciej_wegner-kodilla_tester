package com.kodilla.collections.adv.exercises.homework;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    private FlightFinder flightFinder = new FlightFinder();

    @Test
    public void ifGivenDepartureDoesntExistCheckIfItAddToDepartureList(){
        //given
        //when
        List<Flight> departures = flightFinder.findFlightsFrom("Warszawa");
        //then
        assertEquals(3, departures.size());
    }
    @Test
    public void ifGivenDepartureExistsCheckIfItAddToDepartureList(){
        //given
        //when
        List<Flight> departures = flightFinder.findFlightsFrom("Warszawa");
        //than
        assertNotEquals(0, departures.size());
    }

    @Test
    public void ifGivenDepartureExistsCheckIfItAddCorrectlyToDepartureList(){
        //given
        //when
        List<Flight> departures = flightFinder.findFlightsFrom("Warszawa");
        //than
        assertEquals(3, departures.size());
    }

    @Test
    public void ifGivenArrivalDoesntExistCheckIfItAddToDepartureList(){
        //given
        //when
        List<Flight> arrivals = flightFinder.findFlightsTo("Warszawa");
        //then
        assertEquals(0, arrivals.size());
    }
    @Test
    public void ifGivenArrivalExistsCheckIfItAddToDepartureList(){
        //given
        //when
        List<Flight> arrivals = flightFinder.findFlightsTo("Wrocław");
        //than
        assertNotEquals(0, arrivals.size());
    }

    @Test
    public void ifGivenArrivalExistsCheckIfItAddCorrectlyToDepartureList(){
        //given
        //when
        List<Flight> arrivals = flightFinder.findFlightsTo("Wrocław");
        //than
        assertEquals(2, arrivals.size());
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