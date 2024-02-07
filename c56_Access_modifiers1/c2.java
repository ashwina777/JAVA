package com.company.c56_Access_modifiers1;
// package JavaProject.SELF.com.company.c56_Access_modifiers1;

import com.company.c56_Access_modifiers1.c56_access1;

public class c2 {
    public int x1 = 34;
    protected int y1 = 45;
    int z1 = 4;
    private int a1 = 45;

    public void meth1() {
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);
        System.out.println(a1);
    }

    public static void main(String[] args) {
        System.out.println("I am c2.java main method");
        // System.out.println(c2.x1);
        // System.out.println(c2.y1);
        // System.out.println(c2.z1);
        // System.out.println(a1); -> error: a1 has private access in c2
    }
}
