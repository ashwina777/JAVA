package com.company.c65_PracticeSet16;

public class c65_PS16 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        System.out.println(t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getState());
        t2.start();
        System.out.println(t2.getState());
    }
}
class MyThread1 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<10) {
            i++;
            System.out.println(this.getName() + " Good Morning...");
        }
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<10) {
            i++;
            System.out.println(this.getName() + " Welcome...");
            try{
                Thread.sleep(200);
            } catch(InterruptedException e){ e.printStackTrace();}
        }
    }
}
/*
Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
Question 2: Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
Question 3: Demonstrate gerPriority() and setPriority() methods in Java threads.
Question 4: How do you get the state of a given thread in Java?
Answer 4: getState() method is used to get the state of a given thread in Java.
Question 5: How do you get the reference to the current thread in Java?
Answer 5: currentThread() method is used to reference the current thread in Java.
 */