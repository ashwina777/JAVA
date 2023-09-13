/*
    Problem Statement:
    Create a simple Rock, Paper Scissors game in Java.
    (#Use Conditional Statements)
 */
package com.company;
import java.util.Scanner;
import java.util.Random;
public class c19_prac06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for rock 2 for paper and 3 for scissor : ");
        int user = sc.nextInt();
        if(user == 1){
            System.out.println("You choose Rock!");
        }
        else if(user == 2){
            System.out.println("You choose Paper!");
        }
        else if(user == 3){
            System.out.println("You choose Scissor!");
        }

        Random ran = new Random();
        int comp = ran.nextInt(1,4);
        if(comp== 1){
            System.out.println("Computer choose Rock!");
        }
        else if(comp == 2){
            System.out.println("Computer choose Paper!");
        }
        else if(comp == 3){
            System.out.println("Computer choose Scissor!");
        }

        if (user == comp){
            System.out.println("---It's TIE--- ");
        }
        else if(user==1 && comp==2){
            System.out.println("You : LOSE\t Computer : WON");
        }
        else if(user==1 && comp==3){
            System.out.println("You : WON\t Computer : LOSE");
        }
        else if(user==2 && comp==1){
            System.out.println("You : WON\t Computer : LOSE");
        }
        else if(user==2 && comp==3){
            System.out.println("You : LOSE\t C4omputer : WON");
        }
        else if(user==3 && comp==1){
            System.out.println("You : LOSE\t Computer : WON");
        }
        else if(user==3 && comp==2){
            System.out.println("You : WON\t Computer : LOSE");
        }
        else {
            System.out.println("---You have entered wrong choice---");
        }



    }
}
