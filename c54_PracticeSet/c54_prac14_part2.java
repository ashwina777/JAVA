package com.company.c54_PracticeSet;
/*
Java Practice Questions on Abstract Classes & Interfaces
3 ->Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class
and implements basicanimal interface with eat ( ) and sleep methods
5 ->Demonstrate polymorphism  using monkey  class from Q3
6 ->Create an interface TVremote and use it to inherit another interface smart TVremote
7->Create a class TV which implements TVremote interface from Q6
 */
public class c54_prac14_part2 {
    public static void main(String[] args) {
        monkey raju = new human();
        raju.bite();
        raju.jump();
        //raju.speak(); -> cannot use this method because the reference is of monkey which does not have speak meth
    }
}
interface BasicAnimals
{
    void eat();
    void sleep();
}
class monkey
{
    void jump(){System.out.println("jumping...");}
    void bite(){System.out.println("biting...");}
}
class human extends monkey implements BasicAnimals
{
    public void sleep(){System.out.println("sleeping");}
    public void speak(){System.out.println("Hello...!!");}
    public void eat(){System.out.println("eating");}
}
