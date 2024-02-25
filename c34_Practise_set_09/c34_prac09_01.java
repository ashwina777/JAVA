/*
1.Write a Java method to print the multiplication table of a number n.
2.Write a program using functions to print the following pattern:
      *

     **

    ***

   ****

3.Write a recursive function to calculate the sum of first n natural numbers.
4.Write a function to print the following pattern:
    ****

    ***

    **

    *
 */
package com.company;

public class c34_prac08_01
{
    // Method for qus 1
    public static void table(int n)
    {
        int mul;
        for(int i =1 ; i<=10 ; i++)
        {
            mul = n * i;
            System.out.println(n+" x "+i+" = "+mul);
        }
    }
    public static int sum(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else
        {
            return num+sum(num-1);
            // sum(n) = sum(n-1) + n
            // sum(3) = 3 + sum(2)
            // sum(3) = 3 + 2 + sum(1)
            // sum(3) = 3 + 2 + 1
        }
    }
    public static void main(String[] args) {
        // ANS 1:
        table(6);

        // Ans 2: print triangle
        System.out.println("TRIANGLE");
        int n=4;
        for(int i=1; i<=n;i++ )
        {
            for(int j=1;j<=(2*n-1);j++)
            {
                if(j>=(n+1)-i && j<=(n-1)+i)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Another pattern
        System.out.println("TRIANGLE");
        n=5;
        for(int i=0; i<n;i++ )
        {
            for(int j=0;j<(i+1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



        // Ans 3.sum of first n natural numbers
        int sum=sum(3);
        System.out.println("sum is : "+sum);

        // Ans 4. right angle triangle
        System.out.println("RIGHT ANGLE TRIANGLE");
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= (n + 1) - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
