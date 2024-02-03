package com.company.c54_PracticeSet;
/*
Java Practice Questions on Abstract Classes & Interfaces

4 ->Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods
create another class smart telephone and demonstrate polymorphism

 */
public class c54_prac14_part3
{
    public static void main(String[] args) {
        telephone tel = new SmartTelephone();
        tel.disconnected();
        tel.lift();
        //tel.camera(); -> tel variable can't use method of SmartTelephone class
    }
}
abstract class telephone
{
    abstract void lift();
    abstract void disconnected();
}
class SmartTelephone extends telephone
{
    void lift(){System.out.println("Lifting telephone...");}
    void disconnected(){System.out.println("Telephone disconnected...");}
    void camera(){System.out.println("Recording...");}

}