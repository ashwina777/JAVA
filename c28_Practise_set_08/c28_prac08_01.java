/*
Practice Questions on Arrays in Java
1.Create an array of 5 floats and calculate their sum.
2.Write a program to find out whether a given integer is present in an array or not.
3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
4.Create a Java program to add two matrices of size 2x3.
 */
package com.company;
import java.util.Scanner;
public class c28_prac08_01 {
    public static void main(String[] args) {
        // Ans 1.
        float [] array= {87.5f,76.8f,65.7f,87.8f,87.6f};
        float sum=0;
        for(int i=0 ; i<array.length;i++)
        {
            sum+=array[i];
        }
        System.out.println("Sum of array is : "+sum);

        // Ans 2. find given integer in array
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.print("Enter the number you want to find : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        for(int i=0 ; i<arr.length;i++)
        {
            if(num!=arr[i])
            {
                flag=true;
                break;
            }
        }
        if (flag)
        {
            System.out.println(num+" found in array");
        }
        else {
            System.out.println("Element not found");
        }

        //  Ans 3. calc avg marks using for each loop
        float [] marks = {87,98,92,73,75,76,45,34,65,34,23,21,54,62,86};
        sum =0;
        for(float element : marks)
        {
            sum +=element;
        }
        float avg = sum/ marks.length;
        System.out.println("Average marks in class of "+marks.length+" students is : "+avg);

        //  Ans 4. add two matrices of size 2x3
        int[][] matrix1 = {{1,2,3},{4,5,6}};
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        int[][] res = {{0,0,0},{0,0,0}};
        for(int i=0; i<matrix1.length ;i++)
        {
            for(int j=0; j<matrix1[i].length;j++)
            {
                res [i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Resultant matrix : ");
        for(int i=0; i<matrix1.length ;i++)
        {
            for(int j=0; j<matrix1[i].length;j++)
            {
                System.out.printf(" %d ",matrix1[i][j]);

            }
            System.out.println();
        }
        System.out.println("+");
        for(int i=0; i<matrix1.length ;i++)
        {
            for(int j=0; j<matrix1[i].length;j++)
            {
                System.out.printf(" %d ",matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println("=");
        for(int i=0; i<matrix1.length ;i++)
        {
            for(int j=0; j<matrix1[i].length;j++)
            {
                System.out.printf(" %d ",res[i][j]);
            }
            System.out.println(" ");
        }
    }
}
