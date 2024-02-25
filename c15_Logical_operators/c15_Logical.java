package com.company;
public class c15_Logical
{
    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b && c){
            // logical AND returns true if all values are true
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        if (a || b || c){
            // logical OR returns true if at least one value is true
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        // logical NOT inverts the values
        System.out.println("Not(a) is "+!a);
        System.out.println("Not(b) is "+!b);
        System.out.println("Not(c) is "+!c);
    }
}
