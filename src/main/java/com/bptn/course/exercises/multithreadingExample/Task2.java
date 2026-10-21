package com.bptn.course.exercises.multithreadingExample;

public class Task2 extends Thread{
    public void print(){
        System.out.println("Executing Task 2");
    }

    @Override
    public void run() {
        print();
    }
}