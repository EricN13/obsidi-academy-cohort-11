package com.bptn.course._04_arrays;

public class Fibonacci {
    public static void main(String[] args) {

        // Predefined numbers to start off the Fibonacci series:
        int num1 = 0; int num2 = 1;
        System.out.print(num1+", "+num2);

        // Print the first two numbers of the Fibonacci series:
        for(int i=3; i<=10; i++){
          int num3 = num1 + num2;
          System.out.print(", "+num3);
          num1 = num2;
          num2 = num3;
        }

        // Print the next 8 numbers of the Fibonacci series:
    
    }
}