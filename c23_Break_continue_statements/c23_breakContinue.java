package com.company;
public class c23_breakContinue
{
    public static void main(String[] args)
    {
       // break and continue using loops
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println(i);
            System.out.println("JAVA IS GREAT");
             if(i==2)
             {
                System.out.println("Ending the loop");
                break;  // exit the loop
            }
        }
        for(int i=0 ; i<5 ; i++)
        {
            if(i==3)
            {
                continue; // skips particular iteration
            }
            System.out.println(i);
        }

     }
}

