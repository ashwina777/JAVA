package com.company.c60_multithreading_Runnable;

public class c60_runnable {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1(); // new state
        Thread thread1 = new Thread(t1); // new state
        MyThread2 t2 = new MyThread2();
        Thread thread2 = new Thread(t2);
        thread1.start(); // runnable state
        thread2.start();

    }
}
class MyThread1 implements Runnable{
    public void run()
    {
        int i=0;
        while(i<100) {
            i++;
            System.out.println("I am thread 1 that implements Runnable interface");
        }
    }
}
class MyThread2 implements Runnable{
    public void run()
    {
        int i=0;
        while(i<100) {
            i++;
            System.out.println("I am thread 2 that implements Runnable interface");
        }
    }
}