package com.company.c56_Access_modifiers2;

import com.company.c56_Access_modifiers1.c2;

public class c56_access3 {
    public static void main(String[] args) {
        test t = new test();
        t.meth1();

    }
}

class test extends c2 {
    void meth2() {
        System.out.println(x1);
        System.out.println(y1);
        // System.out.println(z1); // error: z1 has default access in c2 c
        // System.out.println(a1); // error: a1 has private access in c2
    }
}
/*
 * output:
 * PS C:\Users\Amit rana\ASHWINA\javaproject\self> javac
 * com/company/c56_Access_modifiers2/c56_access3.java
 * PS C:\Users\Amit rana\ASHWINA\javaproject\self> java
 * com.company.c56_Access_modifiers2.c56_access3
 * 34
 * 45
 * 4
 * 45
 * here last 2 values are printed by meth1() in c2.java file
 */