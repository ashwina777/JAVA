/*
5.Write a Java program to reverse an array.
6.Write a Java program to find the maximum element in an array.
7.Write a Java program to find the maximum element in a Java array.
8.Write a Java program to find whether an array is sorted or not.
 */
package com.company;
public class c28_prac08_02
{
    public static void main(String[] args) {
        // Ans 5.  reverse an array
        int [] array={0,1,2,3,4,5,6,7,8,9,10};
        int l = array.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for( int element : array)
        {
            System.out.print(element);
            System.out.print("  ");
        }
        for(int i =0 ; i< n;i++)
        {
            // swap array[l]=array[array.length-i-l];
            temp = array[i];
            array[i]=array[l-i-1];
            array[l-i-1]=temp;
        }
        System.out.println("\nAfter reversing array is : ");
        for(int element: array){
            System.out.print(element + "  ");
        }

        //  Ans 6. Max element in array
        int [] arr = {23,34,54,34,65,34,23,35,545,45,345,432,67,546,435};
        int max = arr[0];
        for (int element :arr)
        {
            if(max<element){
                max = element;
            }
        }
        System.out.println("\nMaximum element in array is : "+max);

        //  Ans 7.max element find in java
        max = Integer.MAX_VALUE;
        System.out.println(max);
        int min = Integer.MIN_VALUE;
        System.out.println(min);

        // Ans 8. find array sorted or not
        int [] a = {2,4,6,8,11,13,24,45,56,74,78};
        boolean isSorted = true;
        for(int i=0 ; i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                isSorted=false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("array is sorted");
        }
        else {
            System.out.println("array is not sorted");
        }
    }
}
