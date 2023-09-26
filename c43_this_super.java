package com.company;

public class c43_this_super {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(25);
        // this is a way for us to reference an obj of the class which is being created/referenced
        // this can be used if i want to pass the obj e in its own function  e.g. Ekclass()
        System.out.println(e.getA());

        Doclass d = new Doclass(67);
    }
}
class Ekclass
{
    int a;

    public int getA() {
        return a;
    }
//    Ekclass(int v)  // this works fine when variable name is different
//    {
//        a=v;        // or this.a=v;  works just as fine
//    }

    Ekclass(int a) // when variable name is same use of this keyword is compulsory
    {
        //a=a;        -> gives output 0
        this.a=a;
        // func(this)
    }
//        Ekclass()   either use this without super()
//    {
//        System.out.println("default constructor");
//    }
    public int returnone()
    {
        return 1;
    }
}
class Doclass extends Ekclass
{
    Doclass(int c)
    {
        super(c);  // or
        System.out.println("i am constructor of Doclass");
    }
}
// super is a reference var used to refer immediate parent class obj