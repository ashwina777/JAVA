package com.company.c51_DefaultMethods;
// an interface can have static and default methods
interface MyCamera{
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

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    public void record4KVideo(){  // can be overridden
    System.out.println("Taking snap and recoding in 4k");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"ashwina", "misty", "Avant5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class c51_DefMeth {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        ms.connectToNetwork("MyJio");
        ms.callNumber(1003467098);
        //ms.greet(); --> Throws an error! private method
        String[] ar = ms.getNetworks();
        //System.out.println(ar);
        for (String item: ar) {
            System.out.println(item);
        }
    }
}
