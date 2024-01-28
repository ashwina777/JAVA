package com.company.c50_multipleInheritance;
// another reason to use interface is multiple-inheritance
// Multiple-inheritance is using 2 or more class to make 1 child class
// interface inherits 1 class and implements multiple interfaces
public class c50_multipleInheritance {
    public static void main(String[] args) {
        SmartPhone apple = new SmartPhone();
        apple.click();
        apple.gps();
        apple.pause();
        apple.play();
        apple.volDown();
        apple.volUp();
        apple.zoom();
        apple.record();
        apple.rings();
        System.out.println(apple.ip);
        // apple.ip=45.1001f;
        System.out.println(apple.ip);
    }
}
class CellPhone
{
    void rings()
    {
        System.out.println("tring tring!!");
    }
}
interface GPS
{
     float ip =3487.3432f;
    void gps();
}
interface Camera
{
    void click();
    void zoom();
    void record();
}
interface MediaPlayer
{
    void play();
    void pause();
    void volUp();
    void volDown();
}
class SmartPhone extends CellPhone implements GPS,Camera,MediaPlayer
{
    //public float ip=11.1001f; // This is an instance variable of SmartPhone, not the interface constant
    public void gps(){System.out.println("GPS Working");}
    public void click(){System.out.println("click!");}
    public void zoom(){System.out.println("zoom++!");}
    public void record(){System.out.println("recording...!");}
    public void play(){System.out.println("audio play!");}
    public void pause(){System.out.println("audio paused!");}
    public void volUp(){System.out.println("volume up++!");}
    public void volDown(){System.out.println("volumne down--!");}
}