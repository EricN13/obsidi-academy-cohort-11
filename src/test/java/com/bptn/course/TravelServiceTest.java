package com.bptn.course;
import com.bptn.course.exercises.IndividualProject.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TravelServiceTest {

    @Test
    void testInternationalTravelerDocuments() {

        Traveler traveler = new InternationalTraveler(
                "Eric", 30, "Canadian", "AB123456"
        );

        List<String> documents =
                traveler.getRequiredDocuments();

        assertTrue(documents.contains("Passport"));
    }

    @Test
    void testDomesticTravelerDocuments() {

        Traveler traveler = new DomesticTraveler(
                "Eric", 30, "Canadian"
        );

        assertFalse(
                traveler.getRequiredDocuments()
                        .contains("Passport")
        );
    }

    @Test
    void testInternationalArrivalTime() {

        Traveler traveler = new InternationalTraveler(
                "Eric", 30, "Canadian", "AB123456"
        );

        Trip trip = new Trip(
                traveler,
                "Montreal",
                "Tampa",
                LocalDateTime.of(2027, 5, 10, 20, 0),
                true
        );

        TravelService service = new TravelService();

        assertEquals(
                LocalDateTime.of(2027, 5, 10, 17, 0),
                service.calculateArrival(trip)
        );
    }
}