package com.company;

public class c30_methodOverloading {
    // method overloading -> methods with same name different parameters
    // method overloading cannot be performed by changing the return type of methods
    static void change(int a)  // int a is parameter
    {
        a=98;
    }
    static void change(int[] arr)
    {
        arr[0]=98;
    }
    public static void main(String[] args) {
        // static is used associate a method of given class with the class rather than the obj
        // static method in class is shared by all the objects

        // in case of arrays, the reference is passed. Same is the case for object passing to methods

        // Case 1: changing integer
        int x = 45;
        change(x);  // arguments are actual
        System.out.println("the value of x after change is "+x);

        // Case 2: changing array
        int [] marks={76,85,94,84,65}; // {'array object'} whose reference is marks
        change(marks);
        System.out.println("the value of x after change is "+marks[0]);
        // here value is changed because here reference is passed marks is holding
    }
}
