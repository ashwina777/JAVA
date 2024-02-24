package com.company.c67_errors;
import java.util.Scanner;
// three types of errors :
// syntax errors
// logical errors
// runtime errors
public class c67_errors {
    public static void main(String[] args) {
        // syntax error -> when compiler find something wrong in program
//        int a = 5 -> ; expected
//        b = 3;  -> b not declared
        int a = 5;
        //System.out.println(a+b); //java: cannot find symbol -> symbol:   variable b

        // logical error/bug ->program compiles and executes but does the wrong thing
        // prime numbers between 1-10 ( LOGICAL ERROR DEMO)
        System.out.println(2);
        for(int i=1;i<5;i++){
            System.out.println(2*i+1); // logical error this prints 9 which is not a prime number
        }
        // runtime error -> error encounter while program is running
        System.out.println("Enter 2 numbers : ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(b+"/"+c+"="+(b/c)); // if c=0 error .ArithmeticException
//        Enter 2 numbers :
//        4
//        as
//        Exception in thread "main" java.util.InputMismatchException
    }
}
