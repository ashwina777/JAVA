/*
    Create a class Game, which allows a user to play "Guess the Number"
    game once. Game should have the following methods:
    1. Constructor to generate the random number
    2.takeUserInput() to take a user input of number
    3.isCorrectNumber to detect whether the number entered by the user is true
    4. getter and setter for noOfGuesses
    Use properties such as noOfGuesses(int), etc to get this task done!
 */
package com.company;
import java.util.Scanner;
import java.util.Random;
public class c39_prac10GuessGame
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        Game gm = new Game();
        gm.takeUserInput(num);
        int i =gm.isCorrectNumber();
        while(i!=0)
        {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            gm.takeUserInput(n);
            i=gm.isCorrectNumber();
        }

        System.out.println("Your Number of guesses are : "+gm.NoOfGuesses());

    }
}
class Game
{
    Random ran = new Random();
    int r,n;
    int guess;
    Game()
    {
        r=ran.nextInt(1,100);
    }
    void takeUserInput(int num)
    {
        n=num;
        guess++;
    }
    int isCorrectNumber() {
        if (r == n)
        {
            System.out.println("Congrats!!! You guessed the number right!");
            return 0;
        }
        else if (n > r)
        {
            System.out.println("oops... Your entered a greater number");
            return 1;
        }
        else if (n<r)
        {
            System.out.println("oops... Your entered a smaller number");
            return 1;
        }
        else
        {
            System.out.println("Number is OUT-OF-BOUND");
            return 0;
        }
    }
        int NoOfGuesses()
        {
            return guess;
        }
}