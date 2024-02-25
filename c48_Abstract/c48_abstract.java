package com.company;

public class c48_abstract {
    public static void main(String[] args) {
        // abstract method is a method declaration without implementation
        // abstract class -> class having abstract method
       // Parent p1 = new Parent();     // abstract class cannot be instantiated
       // Child3 c1 = new Child3() ; again abstract class
       Child3 c1 = new Child3(){

           @Override
           public void greet() {
               System.out.println("overridden greet() method in main()");
           }

           @Override
           public void greet2() {
               System.out.println("overridden greet() method in main()");
           }
       };
        Child c = new Child() ;
        c.greet();
        c.greet2();
        c.sayHello();
    }
}
abstract class Parent    // compulsory to declare abstract because it has abstract method
{
    public Parent(){
        System.out.println("i am constructor of base 2");
    }
    public void sayHello()
    {
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child extends Parent   // concrete class will be only made if abstract methods are re-defined
{
    public void greet()         // re-defining the abstract method is compulsory in child class
    {
        System.out.println("Good Morning!");
    }
    public void greet2()         // re-defining the abstract method is compulsory in child class
    {
        System.out.println("Good afternoon!");
    }
}
// if you don't want to redefine the abstract method you can make another abstract class
abstract class Child3 extends Parent{
    public void a()
    {
        System.out.println("how are you?");
    }
}