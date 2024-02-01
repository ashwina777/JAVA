package com.company.c54_PracticeSet;
/*
Java Practice Questions on Abstract Classes & Interfaces
1 ->Create an abstract class pen with methods write () and refill () as abstract methods
2 ->Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
 */
public class c54_prac14_part1 {
    public static void main(String[] args) {
        FountainPen luxor = new FountainPen();
        luxor.ChangeNib();
        luxor.refill();
        luxor.write();
    }
}
abstract class pen
{
    abstract void write();
     //void refill(){}// possible in abstract class
    abstract void refill();
}
class FountainPen extends pen{ // either create a concrete class and implement all methods or declare it as abstract
    public void write(){System.out.println("writing...");}
    public void refill(){System.out.println("refilling in process...");}
    void ChangeNib(){System.out.println("changing the nib...");}
}

