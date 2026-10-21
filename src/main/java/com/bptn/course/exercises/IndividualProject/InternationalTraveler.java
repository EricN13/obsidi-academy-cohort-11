package com.bptn.course.exercises.IndividualProject;

import java.util.Arrays;
import java.util.List;

public class InternationalTraveler extends Traveler {

    private String passportNumber;

    public InternationalTraveler(String name, int age,
                                 String nationality,
                                 String passportNumber) {

        super(name, age, nationality);
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public List<String> getRequiredDocuments() {
        return Arrays.asList(
                "Passport",
                "Boarding pass",
                "Visa / Travel documents"
        );
    }
}
