package com.company;
class One
{
    public void greet()
    {
        System.out.println("Hello ! Good morning");
    }
    public void name()
    {
        System.out.println("My name is ashwina rawat class 1");
    }
}
class Two extends One
{
    public void wlcm()
    {
        System.out.println("WElCOME to java class 2");
    }
    @Override
    public void name()
    {
        System.out.println("My name is ashwina rawat class 2");
    }
}
public class c45_DynamicmethDispatch {
    public static void main(String[] args) {
//        One obj = new One();    // allowed
//        obj.name();
//        Two ob = new Two();     // allowed

        One obj = new Two(); // reference of super-class and obj of subclass
//        Two ob = new One(); // not allowed
        obj.greet();
        obj.name();  // exe of subclass(class 2)
        //obj.wlcm(); -> gives error NOT ALLOWED
    }
}
