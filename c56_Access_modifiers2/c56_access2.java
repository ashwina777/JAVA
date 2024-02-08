package com.company.c56_Access_modifiers2;

import com.company.c56_Access_modifiers1.c2;

public class c56_access2 {
    public static void main(String[] args) {
        c2 c = new c2();
        System.out.println(c.x1);
        // System.out.println(c.y1); // error: y1 has protected access in c2
        // System.out.println(c.z1); // error: z1 is not public in c2; cannot be
        // accessed from outside package
        // System.out.println(c.a1); // error: a1 has private access in c2
    }
}
/*
 * error occur when we try to access the variable of another class from another
 * package
 * uncomment the line 33, 34, 35 and 36 and see the error
 * 
 * outside the package without subclass only public is accessible
 * 
 * 
 * PS C:\Users\Amit rana\ASHWINA\JavaProject\self> javac
 * com/company/c56_Access_modifiers2/c56_access2.java
 * com\company\c56_Access_modifiers2\c56_access2.java:9: error: y1 has protected
 * access in c2
 * System.out.println(c.y1);
 * ^
 * com\company\c56_Access_modifiers2\c56_access2.java:10: error: z1 is not
 * public in c2; cannot be accessed from outside package
 * System.out.println(c.z1);
 * ^
 * com\company\c56_Access_modifiers2\c56_access2.java:11: error: a1 has private
 * access in c2
 * System.out.println(c.a1);
 * ^
 * 3 errors
 * 
 * 
 */