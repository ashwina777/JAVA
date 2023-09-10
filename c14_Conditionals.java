package com.company;
public class c14_Conditionals
{
    public static void main(String[] args)
    {
        int age = 18;   // = is assignment operator
       // if (age = 18)   -> error in java ( not in c)enter bool not int inside if
        if (age == 18)  // == is for equality check RELATIONAL OPERATOR
        {
            System.out.println("you can vote!");
        }
        else {
            System.out.println("You cannot vote!");
        }

    }
}
