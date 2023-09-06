package com.company;
public class c8_precedenceOp
{
    public static void main(String[] args)
    {
        // Precedence & Associativity
        /*
        / *     ->        L to R

                + - ->    L to R

                ++, = ->  R to L
         */

        int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

        System.out.println(a);
        System.out.println(b);

    }
}
