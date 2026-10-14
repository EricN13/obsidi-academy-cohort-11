package com.bptn.course.exercises.teachback;

public class DemoException {
    public static void main(String[] args) {
       //Try block
        try {
            int i = 8;
            int j = 0;
            int k = i / j;

            System.out.println(k);
        //Catch block
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        //Finally block
        } finally {
            System.out.println("Finally block executed");
        }

    }
}