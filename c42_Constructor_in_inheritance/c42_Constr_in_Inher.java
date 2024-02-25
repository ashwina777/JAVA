package com.company;

public class c42_Constr_in_Inher
{
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1(); // even if it doesn't have constructor it has Base() that is why it prints i am a constructor
        // if derived also has constructor first base class constructor will be executed
        System.out.println("Obj with arg");
        Derived1 d2 = new Derived1(3,4);

        ChildOfDerived cd = new ChildOfDerived();
        System.out.println("obj child of derived with args calls super of super of super stmt");
        ChildOfDerived c = new ChildOfDerived(2,3,4);

    }
}
class Base1
{
    Base1()
    {
        System.out.println("I am a constructor of Base1");
    }
    Base1(int a)
    {
        System.out.println("I am an overloaded constructor of Base1 with one int arg : "+a);
    }
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    Derived1()
    {
        //super(0);   -> to call the overloaded constructor
        // Note : the super constructor must be the first statement in constructor else it will throw error
        System.out.println("I am a constructor of Derived1");
    }
    Derived1(int x,int y)
    {
        super(x);
        System.out.println("I am an overloaded constructor of Derived 1 with args : "+x+" and " +y);
    }
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
class ChildOfDerived extends Derived1
{
    ChildOfDerived()
    {
        System.out.println("I am a child of Derived Constructor");
    }
    ChildOfDerived(int x , int y, int z)
    {
        super(4,5);
        System.out.println("I am overloaded constructor with values x y and z as :"+x+" "+y+" "+z);
    }

}
/*
    when a derived class is extended from the base class, the constructor
    of the base class is executed first followed by the constructor of the derived class.
    constructor execution order :
    parent  --> child -->  grandchild
    when there are multiple constructors in the parent class the constructor
    without any parameters is called from child class
    If we want to call constructor with parameters from parent class
    we use super keyword...
 */