/*
        Practice Questions on Loops
        Question 1: Write a program to print the following pattern :

        ****

        ***

        **

        *

        Question 2: Write a program to sum first n even numbers using a while loop.

        Question 3: Write a program to print the multiplication table of a given number n.

        Question 4: Write a program to print a multiplication table of 10 in reverse order.

        Question 5: Write a program to find the factorial of a given number using for loops.

        Question 6: Repeat problem 5 using a while loop.

        Question 7: Repeat problem 1 using for/while loop.

        Question 8: What can be done using one type of loop can also be done using the other two types of loops - True or False.

        Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.

        Question 10 :A do-while loop is executed:

        At least once
        At least twice
        At most once
        Question 11: Repeat problem 2 using for loop.
 */
package com.company;
public class c24_prac07_2 {
    public static void main(String[] args) {
        // Ans 6. Factorial using while loop
        int n = 5, fact = 1;
        int num = n;
        while (n != 0) {
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial of " + num + " is : " + fact);


        // Ans 7. pattern using while loop
        int r = 0;
        int c = 4;
        while (r < 4) {
            while (c > 0) {
                System.out.print("*");
                c--;
            }
            c=4-r;
            System.out.println();
            r++;
        }
        // Ans 8.
        /*
        True. In computer programming, different types of loops (e.g., for loops, while loops, and do-while loops)
        are used to repeat a set of instructions or statements until a certain condition is met.
        While they have slightly different syntax and use cases, any task that can be accomplished with one type
        of loop can generally also be achieved with the other two types of loops.
        It might require different control structures and conditions, but the fundamental concept of repetition remains the same.
        Therefore, it is true that what can be done using one type of loop can also be done using the other two types of loops.
        The choice of which loop to use often depends on the specific requirements and readability of the code.
       */

        // Ans 9.
        n = 8;
        int mul,sum=0;
        for(int i =1 ; i<=10 ; i++)
        {
            mul = n * i;
            sum = sum + mul;
            System.out.println(n+" x "+i+" = "+mul);

        }
        System.out.println("Sum of table : "+sum);

        // Ans 10.A do-while loop is executed:        At least once

        // Ans 11. sum of first n num using for loop
        sum=0;
        n = 4;
        for(int i=0 ; i<n ; i++)
        {
            sum = sum + (2*i);
        }
        System.out.println("Sum of first "+ n +" numbers is "+sum);

    }
}