package com.bptn.course._04_arrays;

 // imported scanner
import java.util.Scanner;
class FactorialExample{
    public static void main(String args[]){

        //create a scanner object to let user input the number
        Scanner input = new Scanner(System.in);

        //display the message to enter the number and read the entered number

        System.out.print("enter the number:");
        int number = input.nextInt();
        //display the entered number

        System.out.println("the input number is :" +" " + number);

        //initiated the factorial to 1
        int fact=1;
        // loop the factorial 1 to the nented number
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
       //display the factorial of the entered number
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}