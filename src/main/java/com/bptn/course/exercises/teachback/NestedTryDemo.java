package com.bptn.course.exercises.teachback;

public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Starting process");

            try {
                int result = 10/0;
            } catch (ArithmeticException e) {
                System.out.println("Division error");
            }

            System.out.println("Continuing process");

        } catch (Exception e) {
            System.out.println("Unexpected error");
        }
        finally{
            System.out.println("Done. bye!");
        }
    }
}
