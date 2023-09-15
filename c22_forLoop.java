package com.company;
public class c22_forLoop
{
    public static void main(String[] args)
    {
        // syntax - > for(initialization ; check bool expression ; update )

        System.out.println("Generate N odd numbers : ");
        for ( int i = 0 ; i < 10; i++)
        {
            System.out.println(2*i+1);
        }

        System.out.println("\n\nPrint n natural numbers in reverse order :");
        for ( int i = 50 ; i > 0; i--)
        {
            System.out.println(i);
        }
    }
}
