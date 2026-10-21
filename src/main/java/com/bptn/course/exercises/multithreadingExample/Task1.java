package com.bptn.course.exercises.multithreadingExample;
// implementing multithreading by extending Thread
public class Task1 extends Thread{
    public void print(){
        System.out.println("Executing Task 1");
    }

    @Override
    public void run() {
        print();
    }
}
