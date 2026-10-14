package com.bptn.course._11_multi_threading._coding_1_52;

import java.util.List;

public class MyThread extends Thread {

    // Declare an instance variable of type List<Integer>
    List<Integer> list;

    // Create a parameterized constructor.
    MyThread(String name, List<Integer> list){
        super();
        this.setName(name);
        this.list = list;
    }

    // Override the run() method here.
    @Override
    public void run() {
        ListUtils.insertNextId(list);
    }
}