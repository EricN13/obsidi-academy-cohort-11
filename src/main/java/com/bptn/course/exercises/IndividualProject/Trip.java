package com.bptn.course.exercises.IndividualProject;

import java.time.LocalDateTime;

public class Trip {

    private Traveler traveler;
    private String departureAirport;
    private String destinationAirport;
    private LocalDateTime flightTime;
    private boolean checkedBaggage;

    public Trip(Traveler traveler,
                String departureAirport,
                String destinationAirport,
                LocalDateTime flightTime,
                boolean checkedBaggage) {

        this.traveler = traveler;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.flightTime = flightTime;
        this.checkedBaggage = checkedBaggage;
    }

    public void setTraveler(Traveler traveler) {
        this.traveler = traveler;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public void setFlightTime(LocalDateTime flightTime) {
        this.flightTime = flightTime;
    }

    public void setCheckedBaggage(boolean checkedBaggage) {
        this.checkedBaggage = checkedBaggage;
    }

    public Traveler getTraveler() {

        return traveler;
    }

    public String getDepartureAirport() {

        return departureAirport;
    }

    public String getDestinationAirport() {

        return destinationAirport;
    }

    public LocalDateTime getFlightTime() {

        return flightTime;
    }

    public boolean hasCheckedBaggage() {

        return checkedBaggage;
    }
}
