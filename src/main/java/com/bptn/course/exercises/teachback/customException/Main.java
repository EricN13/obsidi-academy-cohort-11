package com.bptn.course.exercises.teachback.customException;
public class Main {

    static void checkAge(int age)
            throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Must be 18+");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Age validation completed.");
        }
    }
}
