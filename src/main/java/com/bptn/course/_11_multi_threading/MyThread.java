package com.bptn.course._11_multi_threading;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("This code is running in a thread");
        for(int i=0; i<10;i++) {
            System.out.println(i);
        }
        System.out.println(this.getState());
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println(thread.getState());
        thread.setName("LoopThread");
        System.out.println(thread.getName());
        thread.start();
        for(int i=10; i<20;i++) {
            System.out.println(i);
        }
        System.out.println("This code is outside of the thread");
        System.out.println(thread.getState());
        thread.interrupt();
        System.out.println(thread.getState());
    }

}
