package com.company;
public class c20_whileLoops
{
    public static void main(String[] args)
    {
        /*
        while (Boolean condition)

        {

            // Statements    -> This keeps executing as long as the condition is true.

        }
*/
        int i = 100;
        while(i<=200)
        {
            System.out.println(i);
            i++;
        }
//        while(true)  -> infinite loop
//        while(1)  // error int cannot be converted to boolean
//        {
//            System.out.println("ashwina");
//        }

        // while loop is generally used when the number of iterations is unknown
    }
}
