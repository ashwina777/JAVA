package com.company;

public class c33_fibonacci {
    static int fibonacci(int n) {
       /*
       if (n == 1) {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        */
        if (n == 1 || n == 2)
        {
            return n - 1;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    public static void main(String[] args) {

        int num= 10;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
