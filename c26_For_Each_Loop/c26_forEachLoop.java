package com.company;

public class c26_forEachLoop {
    public static void main(String[] args)
    {
        /* Syntax :
                 for (dataType element:Array) {
                    Sout(element);    //Prints all the elements
                }
        */
        float [] marks = {76,87,85,93,84};
        System.out.println(marks[3]);
        System.out.println(marks.length);   // length of array -> number of elements
        String [] students = {"ashwina","arti","eshika","mahak"};
        System.out.println(students[0]);

        // displaying array using for loop
        System.out.println("printing using for loop");
        for(int i = 0 ; i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        // for each loop in java
        System.out.println("printing using for each loop");
        for(String element : students)
        {
            System.out.println(element);
        }
    }
}
