package com.company;

import java.sql.SQLOutput;

public class c7_operators
{
    public static void main(String[] args)
    {
        // 1.ARITHMETIC OPERATOR
        int a = 4;
        int b = 6*a;
        System.out.println(b);
        // note - arithmetic op don't work with bool
        // %( Modulo operator) can work on float and int
        int c = 47 , d = 5;
        System.out.println(c%d);
        // 4.8%1.1 --> Returns Decimal Remainder
        float n1=4.8f ,n2=1.1f;
        System.out.println(n1%n2);

        // 2.ASSIGNMENT OPERATOR
        d += 3; // working --> d=d+3
        System.out.println(d);

        // 3.COMPARISON OPERATOR (returns bool)
        System.out.println(6==8);
        System.out.println(76>54);

        // 4.LOGICAL OPERATOR test more than one condition
        System.out.println(64>6 && 54>87); //AND op
        System.out.println(64>6 || 54>87); // OR op

        // 5.BITWISE OPERATOR ( operations on bit level)
        // it first converts number in bits than does the operation
        System.out.println(2&3);
        //        10
        //        11
        //        ----
        //        10

    }
}
