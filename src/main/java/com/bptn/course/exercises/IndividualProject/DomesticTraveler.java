package com.bptn.course.exercises.IndividualProject;

import java.util.Arrays;
import java.util.List;

public class DomesticTraveler extends Traveler {

    public DomesticTraveler(String name, int age,
                            String nationality) {
        super(name, age, nationality);

    }

    @Override
    public List<String> getRequiredDocuments() {
        return Arrays.asList(
                "Boarding pass",
                "Government issued ID"
        );
    }
}
