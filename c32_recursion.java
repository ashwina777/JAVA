package com.company;

public class c32_recursion
{
    // recursive approach
    static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    // iterative approach
    static int factorialIterative(int n)
    {

        if(n==0 || n==1)
        {
            return 1;
        }
        else {
            int fact = 1;
            for (int i = 1; i <=n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        // recursion -> function calling itself
        System.out.println("Factorial is :"+factorial(5));
        System.out.println("Factorial is :"+factorial(0));
        System.out.println("Factorial is :"+factorialIterative(4));
        System.out.println("Factorial is :"+factorialIterative(1));
    }
}
