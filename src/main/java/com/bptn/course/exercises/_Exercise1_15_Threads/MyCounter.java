package com.bptn.course.exercises._Exercise1_15_Threads;

class MyCounter {
    private volatile int c = 0;
    //added suncronized to ensure thread-safe
    public synchronized void increment() {
        c++;
    }}