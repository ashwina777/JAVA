package com.company.c61_ThreadConstructor;

public class c61_ThreadConstructors {
    public static void main(String[] args) {
        Thread t1 = new MyThread("ashwina");
        MyThread t2 = new MyThread("ash");
        //Thread t2 = new MyThread();
        t1.start();
        System.out.println("The id of the thread is " + t1.getId());
        System.out.println("The id of the thread is " + t1.getName());
        System.out.println("The id of the thread is " + t2.getId());
        System.out.println("The id of the thread is " + t2.getName());
        MyThread2 t3 = new MyThread2();
        Thread thread1 = new Thread(t3);
        thread1.start();
        MyThread2 t4 = new MyThread2();
        Thread thread2 = new Thread(t4,"abc");
        thread2.start();

    }
}
class MyThread extends Thread{
    public MyThread(String name){ // this constructor allocates a new Thread obj
        super(name);
    }
    public MyThread(Runnable r){
        super(r);
    }
    public MyThread(Runnable r,String name){
        super(r);
    }
    public void run()
    {
        System.out.println("I am a thread");
    }
}
class MyThread2 implements Runnable{
    public void run(){
        System.out.println("I am thread 2 formed by implementing Runnable interface");
    }
}