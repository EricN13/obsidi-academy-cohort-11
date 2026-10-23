package com.bptn.course;

import com.bptn.course.exercises.IndividualProject.TravelService;
import com.bptn.course.exercises.IndividualProject.Trip;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TravelServiceTest {

    private TravelService service;
    private LocalDateTime flightTime;

    @BeforeEach
    void setUp() {
        service = new TravelService();
        flightTime = LocalDateTime.now().plusDays(10);
    }

    // FEATURE 1: MY TRIP
    @Test
    void testCreateTrip() {

        Trip trip = service.addTrip(
                "Eric",
                "Manzi",
                30,
                "Canadian",
                "eric@example.com",
                1,
                "",
                "YUL",
                "YYZ",
                flightTime,
                false
        );

        assertNotNull(trip);
        assertEquals("Eric", trip.getTraveler().getFirstName());
        assertEquals("Manzi", trip.getTraveler().getLastName());
        assertEquals("YUL", trip.getDepartureAirport());
    }

    // FEATURE 2: RECOMMENDED ARRIVAL TIME
    @Test
    void testRecommendedArrivalTime() {

        Trip trip = service.addTrip(
                "Eric", "Manzi", 30,
                "Canadian", "eric@example.com",
                2, "PA123456",
                "YUL", "JFK",
                flightTime, true
        );

        LocalDateTime arrival =
                service.calculateArrival(trip.getTripId());

        assertEquals(flightTime.minusHours(3), arrival);
    }

    // FEATURE 3: TRAVEL CHECKLIST & SUMMARY
    @Test
    void testTravelChecklistAndSummary() {

        Trip trip = service.addTrip(
                "Eric", "Manzi", 30,
                "Canadian", "eric@example.com",
                2, "PA123456",
                "YUL", "JFK",
                flightTime, true
        );

        Trip savedTrip = service.findTrip(trip.getTripId());

        List<String> checklist =
                service.makeChecklist(trip.getTripId());

        assertEquals("Eric", savedTrip.getTraveler().getFirstName());
        assertEquals("JFK", savedTrip.getDestinationAirport());
        assertTrue(checklist.contains("Passport"));
        assertTrue(checklist.contains("Checked baggage"));
    }
}