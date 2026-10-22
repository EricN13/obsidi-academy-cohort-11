package com.bptn.course.exercises.IndividualProject;

import java.util.List;

public abstract class Traveler {

    private String fullName;
    private int age;
    private String nationality;

    public Traveler(String fullName, int age,
                    String nationality) {
        this.fullName = fullName;
        this.age = age;
        this.nationality = nationality;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFullName() {

        return fullName;
    }

    public int getAge() {

        return age;
    }

    public String getNationality() {

        return nationality;
    }


    public abstract List<String> getRequiredDocuments();
}