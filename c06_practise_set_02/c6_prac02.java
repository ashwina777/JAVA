/*
QUESTION:-
1.Write a program to sum three numbers in Java.
2.Write a program to calculate CGPA using marks of three subjects (out of 100)
3.Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
4.Write a Java program to convert Kilometers to miles.
5.Write a Java program to detect whether a number entered by the user is an integer or not.
 */
package com.company;
import java.util.Scanner;

public class c6_prac02 {
    public static void main(String[] args) {
        // ans 1:
        int a = 34 , b=45 , c=98;
        System.out.println(a+b+c);

        // Ans 2:
        float sub1 = 67;
        float sub2 = 79;
        float sub3 = 87;
        float cgpa = (sub1+sub2+sub3)/30;
        //sub1,sub2,sub3 should also be float to get float value as result
        System.out.println(cgpa);

        // Ans 3:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println("Hello "+ name + ", have a good day!");

        //Ans 4.
        float km = 65.5f;
        float miles = km * 0.62137f;
        System.out.println(km + " in miles = "+miles);

        // Ans 5.
        System.out.print("Enter a number : ");
        //boolean b1 = sc.hasNextInt();
        System.out.println(sc.hasNextInt());
    }
}
