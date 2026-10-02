package com.bptn.course.exercises;

import java.util.Scanner;

public class StringOperations {
    public  static void main (String[] args){
        System.out.println("Press 1 from Palindrome Check");
        System.out.println("Press 2 to Reverse a String");
        System.out.println("Press 3 for String Comparison");
        System.out.println("Enter your selection:");
      Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice==1){
            System.out.println("Enter a String: ");
            String enter=scanner.next();
            String reversed="";
            for(int i= enter.length()-1;i>=0; i--){
                reversed=reversed+enter.charAt(i);

            }
            if(enter.equals(reversed)) {
                System.out.print("it is palindrome");

            }else{
                System.out.print("it is not palindrome");
        }
            }


        else if (choice==2){
            System.out.println("Enter a String: ");
            String enter=scanner.next();
            String reversed="";
            for(int i= enter.length()-1;i>=0; i--){
                reversed=reversed+enter.charAt(i);

            }
            System.out.print("reversed word is:" +reversed);

        }
        else if(choice==3){
            System.out.println("Enter the first String: ");
            String first=scanner.next();
            System.out.println("Enter the second String: ");
            String second=scanner.next();
            if (first.equals(second)){
                System.out.println("the strings are equal ");



            }else{
                System.out.print("strings are not equal");
            }


        }
        scanner.close();


    }

}
