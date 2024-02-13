package com.company.c62_ThreadGrouping;

public class threadGroup {
    public static void main(String[] args) {
        ThreadGroup group1 = new ThreadGroup("MyThreadGroup");
        MyThread t1 = new MyThread(group1,"Thread 1");
        MyThread t2 = new MyThread(group1,"Thread2");
        MyThread t3 = new MyThread(group1,"Thread3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread extends Thread{
    public MyThread()
    {
        super();
    }
    public MyThread(ThreadGroup group,String name){
        super(group, name);
    }
    public void run()
    {

        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}