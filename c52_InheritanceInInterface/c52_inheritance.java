package com.company.c52_InheritanceInInterface;
interface SampleInterface{
    void meth1();
    void meth2();
}
// interface extends interface /class cannot extend interface
// classes can implement interface not vice versa
interface childSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface // here static not allowed
{
    // compulsory to implement methods of parent class otherwise error
    public void meth1(){
        System.out.println("This is method 1");
    }
    public void meth2(){
        System.out.println("This is method 2");
    }
    public void meth3(){
        System.out.println("This is method 3");
    }
    public void meth4(){
        System.out.println("This is method 4");
    }
}
public class c52_inheritance {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
/*
 interface MyInterface {
    void myMethod();
}

// This will not work
static class MyClass implements MyInterface {
    // Implementation of myMethod
}
Here, if MyClass were allowed to be static, it would not be able to access any instance members or methods of an outer class
if it were a nested class. This violates the contract specified by the interface.

If you need a static nested class, you can declare it without implementing an interface.
 If you want a class to implement an interface, it should not be declared as static.
 This ensures that it can access instance-level members and properly adhere to the contract defined by the interface.*/