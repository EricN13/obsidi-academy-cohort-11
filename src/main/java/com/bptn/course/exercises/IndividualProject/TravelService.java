package com.bptn.course.exercises.IndividualProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TravelService {

    public LocalDateTime calculateArrival(Trip trip) {

        if (trip.getTraveler()
                instanceof InternationalTraveler) {
            return trip.getFlightTime().minusHours(3);
        }

        return trip.getFlightTime().minusHours(1);
    }

    public List<String> makeChecklist(Trip trip) {

        List<String> checklist = new ArrayList<>();

        // Polymorphism: Java selects the correct
        // implementation based on the traveler type.
        checklist.addAll(
                trip.getTraveler().getRequiredDocuments()
        );

        checklist.add("Carry-on bag");

        if (trip.hasCheckedBaggage()) {
            checklist.add("Checked baggage");
        }

        return checklist;
    }
}


