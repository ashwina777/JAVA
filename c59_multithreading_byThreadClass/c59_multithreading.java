package com.company.c59_multithreading_byThreadClass;
// multithreading and multiprocessing are used to achieve multitasking
public class c59_multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
//        MyThread1 t3 = new MyThread2(); not possible
        t1.start();
        t2.start();
    }
}
class MyThread1 extends Thread{
    public void run () {
    int i=0;
        while(i<100){
        i++;
            System.out.println("My thread 1 is running");
            System.out.println("I am chatting");
        }
    }
}
class MyThread2 extends Thread{
    public void run () {
        int i=0;
        while(i<100){
            i++;
            System.out.println("My thread 2 is running");
            System.out.println("I am cooking");
        }
    }
}
/*
threads use shared memory area
thread is a light-weight subprocess whereas process is heavy-weight
threads-> faster context switching
thread helps in multitasking within a process

There are 2 ways to create thread
1. by extending thread class
2. by implementing Runnable Interface

concurrency vs parallelism
 */