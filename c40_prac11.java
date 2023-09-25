/*
        1.create a class cylinder and use getter and setters to set its radius and height
        2.use ➊ to calculate surface and volume of the cylinder
        3.Use a constructor and repeat ➊
        4.Overload a constructor used to initialize a rectangle of length 4 and breath 5 for using custom parameters or overload same cylinder class
 */
package com.company;

public class c40_prac11
{
    public static void main(String[] args) {
        Cylinder cyl1 = new Cylinder();
        System.out.println("Area of cylinder : "+cyl1.area());
        System.out.println("Volume of cylinder : "+cyl1.volume());
        Cylinder cyl = new Cylinder();
        cyl.getVal(6,3);
        System.out.println("Area of cylinder : "+cyl.area());
        System.out.println("Volume of cylinder : "+cyl.volume());
        Cylinder c1 = new Cylinder(4,7);
        System.out.println("Area of cylinder : "+c1.area());
        System.out.println("Volume of cylinder : "+c1.volume());
        Cylinder c2 = new Cylinder(7);
        System.out.println("Area of cylinder : "+c2.area());
        System.out.println("Volume of cylinder : "+c2.volume());
    }
}
class Cylinder
{
    float PI=3.14f;
    int hei,rad;
    Cylinder(int hei, int rad)
    {
        this.hei=hei;
        this.rad=rad;
    }
    Cylinder()
    {
        hei=7;
        rad=3;
    }
    Cylinder(int rad)
    {
        hei=7;
        this.rad=rad;
    }
    public void getVal(int hei, int rad)
    {
        this.hei=hei;
        this.rad=rad;
    }
    public float area()
    {
        return (2*PI*rad)*(rad+hei);
    }
    public float volume()
    {
        return PI*rad*rad*hei;
    }

}
