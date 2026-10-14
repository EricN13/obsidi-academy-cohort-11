package com.bptn.course.exercises.teachback;

public class StackOverflowError {
    public static void main(String[] args){
        sayHello();
    }
    public static void sayHello(){
        sayHello();
    }
}
