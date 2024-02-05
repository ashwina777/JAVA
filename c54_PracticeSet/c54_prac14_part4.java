package com.company.c54_PracticeSet;
/*
Java Practice Questions on Abstract Classes & Interfaces

6 ->Create an interface TVremote and use it to inherit another interface smart TVremote
7->Create a class TV which implements TVremote interface from Q6
 */
public class c54_prac14_part4 {
    public static void main(String[] args) {
        TV samsung = new TV();
        samsung.Scroll();
        samsung.volUp();
        samsung.forward();
    }
}
interface SmartTVremote
{
    void forward();
    void back();
}
interface TVremote extends SmartTVremote
{
    void volUp();
    void volDown();
    void Scroll();
}
class TV implements TVremote
{
    @Override
    public void back() {System.out.println("<-channel");}
    @Override
    public void forward() {System.out.println("->channel");}
    @Override
    public void Scroll() {System.out.println("scroll up/down");}
    @Override
    public void volUp() {System.out.println("vol ++");}
    @Override
    public void volDown() {System.out.println("vol --");}
}