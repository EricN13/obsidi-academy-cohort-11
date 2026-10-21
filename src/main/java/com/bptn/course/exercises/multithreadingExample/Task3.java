package com.bptn.course.exercises.multithreadingExample;

public class Task3 extends Thread{
    public void print(){
        System.out.println("Executing Task 3");
    }

    @Override
    public void run() {
        print();
    }
}
