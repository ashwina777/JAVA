/*
1.Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)
2.Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
3.Create a class Square with a method to initialize its side, calculating area, perimeter etc.
4.Repeat problem 4 for a circle.
 */
package com.company;

public class c36_prac09
{
    public static void main(String[] args)
    {
        // Sol 1 :-
        Employee e1 = new Employee();
        e1.name="ASHWINA RAWAT";
        e1.salary=87000;
        System.out.println("Name : "+e1.getName());
        System.out.println("Salary : "+e1.getSalary());
        e1.setName("ashwina");
        System.out.println("New name : "+e1.getName());

        // Sol 2:-
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.ringing();
        asus.vibrating();

        // Sol 3:-
        Square s1 = new Square();
        System.out.println("Perimeter = "+s1.perimeter());  // value not set so perimeter = 0
        s1.setSide(8);
        System.out.println("Area = "+s1.area());
        System.out.println("Perimeter = "+s1.perimeter());

        // Sol 4:-
        Circle c1 = new Circle();
        c1.setRadius(4);
        System.out.println("Area of circle = "+c1.area());
        System.out.println("Circumference of circle = "+c1.circumference());
    }

}
class Employee
{
    int salary;
    String name;
    int getSalary()
    {
      return salary;
    }

    String getName()
    {
        return name;
    }
    void setName(String New)
    {
        name=New;
    }
}
class CellPhone
{
    public void ringing()
    {
        System.out.println("Ringing...");
    }
    public void vibrating()
    {
        System.out.println("vibrating...");
    }
    public void callFriend()
    {
        System.out.println("calling arti...");
    }
}
class Square
{
    int side;
    public void setSide(int s)
    {
        side=s;
    }
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
class Circle
{
    int rad;
    float PI = 3.14f;
    public void setRadius(int r)
    {
        rad=r;
    }
    public float area()
    {
        return PI*rad*rad;
    }
    public float circumference()
    {
        return 2*PI*rad;
    }
}
