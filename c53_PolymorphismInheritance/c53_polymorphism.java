package com.company.c53_PolymorphismInheritance;

public class c53_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1= new MySmartPhone2(); // this is a smartphone use it as a camera
        //cam1.getNetworks(); -> not allowed only cam functions available
        cam1.record4KVideo();

        MySmartPhone2 iphone=new MySmartPhone2();
        iphone.callNumber(344545);
        iphone.record4KVideo();
        iphone.pickCall();
    }
}
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){  // implementation only allowed when private/default
        System.out.println("Good Morning");
    } // implementing class cannot use it
    // can use private meth in interface itself
    default void  record4KVideo(){ // no need to implement this method in implementing class
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2 {
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
//    public void record4KVideo(){  // can be overridden
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"ashwina", "misty", "Avant5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
// Explanation 
/* 
In line 5 of our code (MyCamera2 cam1 = new MySmartPhone2();), we are using polymorphism to create an object
 cam1 of type MyCamera2 that is actually an instance of the MySmartPhone2 class.

Let me break down what's happening:

Type Declaration (MyCamera2): we declare a variable cam1 with the type MyCamera2.
This means that cam1 is expected to behave like an object of the MyCamera2 interface.

Object Instantiation (new MySmartPhone2()): we create a new object of the class MySmartPhone2 using the new keyword.
Since MySmartPhone2 implements the MyCamera2 interface, it can be treated as an instance of MyCamera2.

So, in simple terms, cam1 is declared as a MyCamera2 type, but it is actually pointing to an instance of MySmartPhone2.
This is possible because MySmartPhone2 implements the MyCamera2 interface, and in Java,
 we can use a reference of an interface type to hold an object of any class that implements that interface.
 This is a form of polymorphism.

As a result, cam1 can only access methods declared in the MyCamera2 interface. Even though MySmartPhone2 has additional methods from other interfaces or its own methods, we can only use the methods defined in the MyCamera2 interface on the cam1 object. This demonstrates one of the key principles of polymorphism in Java.
*/