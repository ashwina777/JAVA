package com.company;
public class c9_resultingDT
{
    public static void main(String[] args) {
        byte x1 = 5;
        int y1 = 6;
        short z = 8;
        int a1 = y1 + z;
        float b = 6.54f + x1;  // evaluate as float coz one is float
        System.out.println(a1);
        System.out.println(b);

        // INCREMENT AND DECREMENT OPERATORS
        int i = 56;
        System.out.println(i++); // first use i then increment
        System.out.println(i);   // i incremented (post)
        System.out.println(++i); // first increment then use i
        System.out.println(i);   // pre incremented value of i

        int j = 5;
        System.out.println(j--); // first use j then decrement
        System.out.println(j);   // j decremented (post)
        System.out.println(--j); // first decrement then use j
        System.out.println(j);   // pre decremented value of j

        // QUICK QUIZ
        int y = 7;
        int x = ++y * 8;
        // increment has higher precedence
        // 8 * 8 = 64
        System.out.println(x);

        char a = 'B';
        // unicode value incremented
        a++; // a is now C
        System.out.println(a);
    }
}
