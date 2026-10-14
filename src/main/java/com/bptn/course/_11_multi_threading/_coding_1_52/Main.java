package com.bptn.course._11_multi_threading._coding_1_52;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(5,1,4,3,6,2));

        // Create a t1 and t2 of MyThread class here.
        MyThread t1 = new MyThread("t1", list);
        MyThread t2 = new MyThread("t2",list);
        System.out.println(t1+" : "+t1.getState());
        System.out.println(t2+" : "+t2.getState());

        // Start t1 and t2 threads here
        t1.start();
        System.out.println(t1+" : "+t1.getState());
        System.out.println(t2+" : "+t2.getState());
        t2.start();
        System.out.println(t1+" : "+t1.getState());
        System.out.println(t2+" : "+t2.getState());
        // Run the join() method from t1 and t2 threads here
        t1.join();
        System.out.println(t1+" : "+t1.getState());
        System.out.println(t2+" : "+t2.getState());
        t2.join();
        System.out.println(t1+" : "+t1.getState());
        System.out.println(t2+" : "+t2.getState());

        // Print out the list variable here.
        System.out.println(list);
        System.out.println(t1+" : "+t1.getState());
        System.out.println(t2+" : "+t2.getState());
    }
}
