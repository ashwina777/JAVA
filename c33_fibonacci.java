package com.company;

public class c33_fibonacci {
    static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    public static void main(String[] args) {

        int n = 5;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
