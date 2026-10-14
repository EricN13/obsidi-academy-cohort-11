package com.bptn.course.exercises._Exercise1_15_Threads;

class CounterIncRunnable implements Runnable {
    private MyCounter counter;
    private int amount;

    public CounterIncRunnable(MyCounter counter, int amount) {
        this.counter = counter;
        this.amount = amount;
    }

    public void run() {
        for (int i = 0; i < amount; i++) {
            counter.increment();
        }
    }
}
