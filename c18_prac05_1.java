/*
Chapter 4– Practice Set
Question 1 : What will be the output of this program:

int a = 10;
if (a=11)
        System.out.println(“I am 11”);
else
        System.out.println(“I am not 11”);
Question 2: Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.

Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:

        Income Slab	    Tax
        2.5L – 5.0L  	5%
        5.0L – 10.0L 	20%
        Above 10.0L	    30%
Note that there is not tax below 2.5L. Take the input amount as input from the user.
 */
package com.company;
import java.util.Scanner;
public class c18_prac05_1 {
    public static void main(String[] args) {
        // qus - guess output
        int a = 10;
//        if (a=11)   -- ans error in java it is assignment not a boolean value
            //java: incompatible types: int cannot be converted to boolean
        if (a==11)
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");

        // Ans 2.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your makrs in 3 subjects : ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        float per = (s1+s2+s3)/3.0f; // 3.0f to divide int by float and get result as float
        System.out.println("Your percentage is "+per);
        if ( per >= 40 && s1>= 33 && s2>=33 && s3>=33){
            System.out.println("Congrats,you have been promoted!");
        }
        else{
            System.out.println("Sorry, you have not been promoted");
        }

        // Ans 3.
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of income : ");
        float amt = s.nextFloat();
        float tax = 0;
        if (amt <= 500000 && amt > 250000) {
            tax = 0.05f * (amt - 250000);
            System.out.println("Total 5tax to be paid : " + tax);
        } else if (amt <= 1000000 && amt > 500000) {
            tax = 0.05f * (250000);
            tax = tax + 0.2f * (amt - 500000f);
            System.out.println("Total tax to be paid : " + tax);
        } else if (amt > 1000000) {
            tax =  0.05f * (250000);
            tax = tax + 0.2f * (1000000f - 500000f);
            tax = tax +0.3f * (amt - 1000000f);
            System.out.println("Total tax to be paid : " + tax);
        } else {
            System.out.println("---No tax to be paid---");
        }
    }
}