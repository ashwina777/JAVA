package com.company.c63_ThreadPriority;

public class c63_ThreadPriority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread extends Thread
{
    public void run() {
        int i=0;
        while(i<5){
            i++;
            //System.out.println(this.getName());
            System.out.println(Thread.currentThread().getName() + " is Running...");

        }
    }
}