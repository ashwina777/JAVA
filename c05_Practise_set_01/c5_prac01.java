/*
Write a program to calculate the percentage of a given student in
the CBSE board exam. His marks from 5 subjects must be taken as input
from the keyboard. (Marks are out of 100)
 */
package com.company;
import java.util.Scanner;
public class c5_prac01
{
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of 5 subjects : ");
    System.out.print("SUBJECT 1: ");
    float s1 = sc.nextFloat();
    System.out.print("SUBJECT 2: ");
    float s2 = sc.nextFloat();
    System.out.print("SUBJECT 3: ");
    float s3 = sc.nextFloat();
    System.out.print("SUBJECT 4: ");
    float s4 = sc.nextFloat();
    System.out.print("SUBJECT 5: ");
    float s5 = sc.nextFloat();
    float per = (s1+s2+s3+s4+s5)/5;
    System.out.print("Percentage = ");
    System.out.println(per);


}

}
