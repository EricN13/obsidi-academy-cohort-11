package com.bptn.course.exercises;

public class ItsPalindrome {
    public static void main ( String[] args){
        String enter="madam";
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
    }

