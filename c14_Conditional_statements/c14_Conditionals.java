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
/*

Relational Operators in Java : 
Relational operators are used to evaluate conditions (true or false) inside the if statements. Some examples of relational operators are:

== (equals)
>= (greater than or equals to)
> (greater than)
< (less than)
<= (less than or equals to)
!= (not equals)
Note: ‘=’ is used for an assignment whereas ‘==’ is used for equality check. The condition can be either true or false.

*/
