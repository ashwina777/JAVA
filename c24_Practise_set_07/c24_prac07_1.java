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
public class c24_prac07_1
{
    public static void main(String[] args)
    {
        // Ans 1.
        for(int r=0 ; r<4 ; r++)
        {
            for(int c=4-r ; c>0 ;c--)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        // Ans 2. sum first n even numbers while loop
        int n = 6,num=n,sum=0;
        while(n>0)
        {
            sum = sum + (2*n);
            System.out.println(sum);
            n--;
        }
        System.out.println("Sum of first "+ num +" numbers is "+sum);


        // Ans 3. multiplication table
        n = 9;
        int mul;
        for(int i =1 ; i<=10 ; i++)
        {
            mul = n * i;
            System.out.println(n+" x "+i+" = "+mul);
        }

        // Ans 4. multi. table of 10 in reverse
        n = 10;
        int mult;
        System.out.println("\nTABLE OF 10 IN REVERSE :");
        for(int i =10 ; i>=1 ; i--)
        {
            mult = n * i;
            System.out.println(n+" x "+i+" = "+mult);
        }

        // Ans 5. find the factorial
        n =6;
         num = n;
        int fact = 1;
        for(int i = n ; i>0 ; i--)
        {
            fact = fact * n;
            n--;
            //System.out.println(fact);
        }
        System.out.println("Factorial of "+ num +" is : "+fact+"\n");

    }
}

