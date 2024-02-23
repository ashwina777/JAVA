package com.company.c64_ThreadMethod;

public class c64_ThreadMeth {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t1.join(); // t2 will not start until t1 is executed
        t2.start(); // t2 will wait so t1 will call join() method
    }
}
class MyThread extends Thread {
    public void run(){
        int i=0;
        while(i<25) {
            i++;
            System.out.println(this.getName() + " thread is running!");
            try {
                Thread.sleep(500);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}