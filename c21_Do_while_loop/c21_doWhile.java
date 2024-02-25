package com.company;
public class c21_doWhile
{
    public static void main(String[] args)
    {
        /* do {

            //code

            } while (condition);            //Note this semicolon */
        int a = 0;
        do {
            System.out.println(a);
            a++;
        }while(a<5);


        a = 10;
        do {
            System.out.println(a);
            a++;
        }while(a<5);
        //main diff b/w while and do while is that do-while executes at least once even if condition is false

        // Quick quiz
        // print first n natural num using do - while
        int num = 0;
                do
                {
                    System.out.println(num);
                    num++;

                }while(num<=100);
    }
}
