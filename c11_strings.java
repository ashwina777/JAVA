package com.company;
import java.util.Scanner;
public class c11_strings
{
    public static void main(String[] args)
    {
        // String is a sequence of characters
        // In java String is a class not a primitive DT

        String name = new String("ASHWINA");
        String nm = "ASH";
        System.out.println(nm);
        System.out.println("The name is : ");
        System.out.print(name);
// strings are immutable and cannot be changed if changed a new copy of obj is created with change
        int a = 6;
        float b =45.376f;
        System.out.printf("\nValue of a is %d value of b is %8.2f",a,b);
        System.out.format("\nValue of a is %d value of b is %f",a,b); // same

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter word :");
        String st = sc.next();
        System.out.println(st);
        sc.nextLine();
        System.out.print("Enter  line :");
        String str = sc.nextLine();
        System.out.println(str);


    }
}
