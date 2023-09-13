/*
    Question 4: Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]

    Question 5:Write a Java program to find whether a year entered by the user is a leap year or not.

    Question 6:Write a program to find out the type of website from the URL:

                .com – commercial website
                .org – organization website
                .in – Indian website
 */
package com.company;
import java.util.Scanner;
public class c18_prac05_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number of week : ");
        int num = sc.nextInt();
        // Enhanced switch case
        switch (num) {
            case 1 -> System.out.println("The day of week is : Monday");
            case 2 -> System.out.println("The day of week is : Tuesday");
            case 3 -> System.out.println("The day of week is : Wednesday");
            case 4 -> System.out.println("The day of week is : Thursday");
            case 5 -> System.out.println("The day of week is : Friday");
            case 6 -> System.out.println("The day of week is : Saturday");
            case 7 -> System.out.println("The day of week is : Sunday");
            default -> System.out.println("--Out of Range---\nEnter number between 1 - 7 !!!");
        }

        // Ans. 5
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        if (year%400==0 ){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }

        // Ans 6.
        System.out.print("Enter url of any website : ");
        String website = sc.next();
        if(website.endsWith(".org"))
        {
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com"))
        {
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("This is an Indian website");
        }
        else {
            System.out.println("Invalid Input!");
        }

    }

}