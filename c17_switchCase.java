package com.company;
import java.util.Scanner;
public class c17_switchCase
{
    public static void main(String[] args)
    {
        // switch case is used when we have to make choice between number of alternatives
        // the switch variable can be int , char or string
        int age;
        System.out.println("Enter age : ");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        switch(age) {
            case 18:
                System.out.println("you are going to become adult");
                break; // used to exit loop otherwise all cases will be executed
            case 23:
                System.out.println("You are going to join job");
                break;
            case 60:
                System.out.println("you are going to retire");
            default:
                System.out.println("Enjoy your life");
        }

        // Enhanced switch
        String var;
        System.out.println("Enter String : ");
        Scanner s = new Scanner(System.in);
        var=s.next();
         switch (var) {
                case "ash" -> {
                    System.out.println("You are going to become an Adult!");
                    System.out.println("You are going to become an Adult!");
                    System.out.println("You are going to become an Adult!");
                }
                case "ashwina" -> System.out.println("You are going to join a Job!");
                case "hello" -> System.out.println("You are going to get retired!");
                default -> System.out.println("Enjoy Your life!");
            }
        }
    }


