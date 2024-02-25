package com.company;
public class c29_methods {
       public static void main(String[] args) {
        // for repeated block of code we make methods which is inside a class
        // difference between function and method is that method is inside class
        int a = 56;
        int b = 45;
        greater(a,b);
        // method invocation using object created -> done when static method not created
        c29_methods obj = new c29_methods();
        obj.great(98,98);
    }
    static void greater(int x, int y) {
        if (x > y) {
            System.out.println(x + " is greater");
        } else if (x == y) {
            System.out.println(x + " is equal to " + y);
        } else {
            System.out.println(y + " is greater");
        }
    }

        void great(int x1, int y1)
        {
            if(x1>y1)
            {
                System.out.println(x1+" is greater");
            }
            else if(x1==y1)
            {
                System.out.println(x1+" is equal to "+y1);
            }
            else
            {
                System.out.println(y1+" is greater");
            }
    }
}

