package com.company.c56_Access_modifiers1;

// access modifiers determine whether other classes can use a particular filed or invoke a particular meth
// access modifiers can be public, private , protected or default(no modifier)
public class c56_access1 {
    public static void main(String[] args) {
        c1 clss = new c1();
        clss.meth1();
        System.out.println(clss.x); // accessible within same package
        System.out.println(clss.y); // accessible within same package
        System.out.println(clss.z); // accessible within same package
        // System.out.println(clss.a); private cannot be accessed within same package
    }
}

class c1 {
    public int x = 34;
    protected int y = 45;
    int z = 4;
    private int a = 45;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

// PS C:\Users\Amit rana\ASHWINA\JavaProject\self> javac
// com/company/c56_Access_modifiers1/c56_access1.java
// PS C:\Users\Amit rana\ASHWINA\JavaProject\self> java
// com.company.c56_Access_modifiers1.c56_access1
// 34
// 45
// 4
// 45
// 34
// 45
// 4