/*
    1.Create a class circle and use inheritance to create another class cylinder from it
    2.Create a class rectangle and use inheritance to create another class cuboid,
        try to keep it as close to the real-world scenario as possible.
    3.Create a method for area and volume in 1
    4.Create methods for area & volume in 2 also create getters and setters
    5.What is the order of constructor execution for the following inheritance hierarchy
                    Base

                   Derived 1

                   Derived 2

    Derived obj = new Derived 2( );
    Which constructor(s) will be executed & in what order?
 */
package com.company;

import javax.swing.plaf.IconUIResource;

public class c47_prac13 {
    public static void main(String[] args) {
        // Ans 1:-
        Cylinder1 c1 = new Cylinder1(3,4);
        Circle1 c2 = new Circle1();
        Circle1 c3 = new Circle1(5);
        System.out.println("Area of cylinder : "+c1.area());
        System.out.println("Volume of cylinder : "+c1.volume());
        System.out.println("Area of circle : "+c2.area());
        System.out.println("Area of circle : "+c3.area());

        // Ans 2:-
        Rectangle r1= new Rectangle();
        r1.setB(5);
        r1.setL(3);
        System.out.println("area of rectangle : "+r1.area());
        Cuboid cu1 = new Cuboid(4,5,6);
        System.out.println("volume of cuboid : "+cu1.volume());
        System.out.println("volume of cuboid : "+cu1.area());

        // Ans 5.
        Derive1 obj = new Derive2( );
        // Order of execution
        // Base -> Derived class 1 -> derived class 2
    }
}
class Circle1
{
    int radius;
    Circle1()
    {
        radius=4;
        System.out.println("I don't know why default constructor is important to make");
    }
    Circle1(int r)
    {
        this.radius=r;
    }
    float PI=3.14f;
    public float area()
    {
        return PI*radius*radius;
    }

}
class Cylinder1 extends Circle1
{
    int height;
        Cylinder1(int r,int h){
            super(r);
            this.height=h;
    }

    public float area()
    {
        return 2*PI*radius*height;
    }
    public float volume()
    {
        return PI*radius*radius*height;
    }
}
class Rectangle
{
    int l,b;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    Rectangle(int l , int b)
    {
        this.l=l;
        this.b=b;
    }
    Rectangle()
    {
        System.out.println("default constructor");
    }
    public int area()
    {
        return l*b;
    }
}
class Cuboid extends Rectangle
{
    int h;
    Cuboid(int l , int b,int height)
    {
        super(l,b);
        this.h=height;
    }
    public int area()
    {
        return 2*(l*b+b*h+h*l);
    }
    public int volume()
    {
        return l*b*h;
    }
}

// Ans 5.
class Base2
{
    Base2(){
        System.out.println("constructor of base class");
    }
}
class Derive1 extends Base2{
    Derive1(){
        System.out.println("constructor of derived class 1");
    }
}
class Derive2 extends Derive1{
    Derive2(){
        System.out.println("constructor of derived class 2");
    }
}