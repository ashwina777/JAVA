package com.company.c49_interface;

public class c49_interfaces {
    public static void main(String[] args) {
         // interface is used to achieve 100% abstraction (all abstract methods)  -> it is group of related methods with empty bodies
        // abstract class have both abstract and non-abstract methods
        AvonCycle ashCycle = new AvonCycle();
        ashCycle.speedUp(23);
        ashCycle.applyBrake(3);
        ashCycle.blowHorn();

        System.out.println(ashCycle.speed); // property can be created in interfaces
        //ashCycle.speed =100;//can't modify properties as they are final (can modify if it is part of implementing class
        System.out.println(ashCycle.speed);
        soccer sc = new soccer();
        sc.applyBrake(3);
        sc.speedUp(56);
        sc.blowHorn();
        sc.BlowHorn2();
        }
    }
    //compulsory to implements all the methods of the interface otherwise compilation will fail
interface Bicycle
{
    int speed = 700; //compiler -> public static final int speed =700
    void applyBrake(int decrement); // compiler -> public abstract void applyBr..
    void speedUp(int increment);
}
interface HornBicycle
{
    void BlowHorn2();
}
class AvonCycle implements Bicycle {
//    int speed=34;
    void blowHorn(){
        System.out.println("too tooo!!");
    }
    public void applyBrake(int decrement) { // must be public else error java: speedUp(int) in com.company.AvonCycle cannot implement speedUp(int) in com.company.
        // Bicycle attempting to assign weaker access privileges; was public
        System.out.println("applying brake");
    }

    public void speedUp(int increment) {
        System.out.println("increasing speed");
    }
}
class soccer extends AvonCycle implements  Bicycle , HornBicycle
{
    // possible
    public void BlowHorn2(){
        System.out.println("tii tii !!");
    }
    // either implement in AvonCycle or soccer but implementation is must
}
