package com.company;
import java.util.Scanner;
public class c16_elseif
{
    public static void main(String[] args)
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        age= sc.nextInt();
        if (age>56){
            System.out.println("you are experienced");
        }
        else if(age>46){
            System.out.println("you are semi experienced");
        }
        else if (age>36){
            System.out.println("You are semi-semi experienced");
        }
        else{  // here the else if ladder ends
            System.out.println("You are not experienced");
        }

    }
}