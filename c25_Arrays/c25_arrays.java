package com.company;

public class c25_arrays {
    public static void main(String[] args) {

        // we use array to access/retrieve data faster
        // classroom of 5 students - store the marks of these 500 students
        // array is used here to store collection of similar type of data
        // int [] marks;    ->    declaration
        // marks = new int[5];   ->  memory allocation
        int [] mark = new int[2];   // declaration + memory allocation
        // mark is reference  || new int -> object

        // initialisation
        mark[0] = 98;
        mark[1] = 87;
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        // values can be over-written
        mark[1]=65;
        System.out.print("Over-written value : ");
        System.out.println(mark[1]);

        // 3. Declaration, memory allocation and initialization together
        int [] marks = {98, 45, 79, 99, 80};

        //marks[5] = 96; // -> throws an error
        System.out.println(marks[4]);

        //array indices starts from 0 and goes till n-1 where n = size of array

        // Displaying an Array : An array can be displayed using a for loop:

        for (int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);    //Array Traversal
        }

        // quick quiz Write a Java program to print the elements of an array in reverse order.
        System.out.println("ARRAY TRAVERSAL IN REVERSE ORDER");
        for (int i=marks.length-1; i>=0; i--)
        {
            System.out.println(marks[i]);
        }
    }
}