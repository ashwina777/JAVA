package com.company;
/*
    when a class inherits from a superclass, it inherits parts
    of super class methods because their accessibility depends
    on the access modifiers used

    NOTE:
    java doesn't support multiple inheritance i.e. two classes
    cannot be super class for a subclass
 */
public class c41_inheritance {
    public static void main(String[] args) {
        // accessing base class members from its own obj
        Base b = new Base();
        b.setX(9);
        System.out.println(b.getX());
        b.print();
//       b.setY();      => cannot access derives class members from base class

        // accessing base class from derived obj
        Derived d = new Derived();
        d.setX(4);
        System.out.println(d.getX());
        d.print();
        // accessing derived class's own members
        d.setY(34);
        System.out.println(d.getY());
        d.printIt();

    }
}
class Base
{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    void print()
    {
        System.out.println("i am a base class");
    }
}
class Derived extends Base
{
    // base class is inherited to derived class
    // inheritance is used to borrow properties and methods from existing class
    int y;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    void printIt()
    {
        System.out.println("i am inherited class");
    }
}