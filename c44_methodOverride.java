package com.company;
// method overriding is redefining method of super class same args
// also the access modifier should be same ... we cannot override static and final method
class A
{
    public int a;
    public int returnmethod(int a){
        return a;
    }
//    public void meth1(int a)  -> override annotation gives error
    public void meth1()
    {
        System.out.println("I am method 1 of class A");
    }
}
class B extends A
{
    @Override                   // this override annotation is helpful to know if a method is overridden or not
    public void meth1()         // overridden method
    {
        System.out.println("I am method 2 of class B");
    }
    public void meth2()
    {
        System.out.println("I am method 2 of class B");
    }

}
public class c44_methodOverride
{
    public static void main(String[] args) {
        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();    // overridden method
        System.out.println(b.returnmethod(6));
    }
}
