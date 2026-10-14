package com.bptn.course.exercises._Exercise1_15_Threads;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter = new MyCounter();

        Scanner scan = new Scanner(System.in);
        System.out.print("Two counters will run. How many iterations should they count? ");

        int iter = scan.nextInt();
        //let's split the iteration between two threads to avoid counting the same iteration twice
        Thread thread1 = new Thread(new CounterIncRunnable(counter, iter/2));
        // assign the remaining iteration s to thread2. to handle odd number
        Thread thread2 = new Thread(new CounterIncRunnable(counter, iter-iter/2));

        // we start both treads
        thread1.start();
        thread2.start();
        //wait for both to finish before we dsplay the final counter value

        thread1.join();
        thread2.join();

        System.out.println(counter.value());
    }
}