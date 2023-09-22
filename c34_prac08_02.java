/*
2.Write a program using functions to print the following pattern:
   *
  ***
 *****
*******

3.Write a recursive function to calculate the sum of first n natural numbers.
4.Write a function to print the following pattern:
****
***
**
*
5.Write a function to find the average of a set of numbers passed as arguments.
6.Repeat problem 4 using Recursion.
7.Repeat problem 2 using Recursion.
8.Write a function to convert Celsius temperature into Fahrenheit.
9.Repeat problem 3 using an iterative approach.
 */
package com.company;

public class c34_prac08_02
{
    // Ans 5.
    static void avg(int ...num)
    {
        int res=0;
        for(int a:num)
        {
            res+=a;
        }
        int a=num.length;
        System.out.println("Average is : "+res/a);
    }

    // Ans 6.
    static void pattern1(int n)
    {
        if(n>0)
        {
            pattern1(n-1);
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // pattern1_rec(3)
        // pattern1_rec(2) + 3 times star and new line
        // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
        // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
    }

    // Ans 7.
    static void pattern2(int n) {
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
            pattern2(n - 1);
        }
    }

    // Ans 9.
    static void sum(int val)
    {
        int res=0;
        for(int i=1 ; i<=val ; i++)
        {
            res+=i;
        }
        System.out.println("sum is : "+res);
    }

    public static void main(String[] args) {
        // Ans 5.
        avg(1,2,3,4,5,6,7,8,9,10);
        avg(11,34,56,34,65);

        // Ans 6.
        System.out.println("Pattern 1 : ");
        pattern1(6);

        // Ans 7.
        System.out.println("Pattern 2 : ");
        pattern2(7);

        // Ans 8.
        float cel=56;
        float fah= (cel*9/5)+32;
        System.out.println(fah);

        // Ans 9. sum first n natural numbers
        sum(4);
    }
}
