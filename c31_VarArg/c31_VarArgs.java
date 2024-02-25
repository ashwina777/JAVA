package com.company;

public class c31_VarArgs {
    // varArgs is used to give multiple args to a function
    static int sum(int ...arr)
    {
        // available as int[] arr;
        int result=0;
        for(int a : arr){
            result+=a;
        }
        return result;
        //System.out.println("Result is : "+result);
    }
    static int add(int a,int ...arr) // here a is compulsory arg
    {
        int result=a;
        for(int element : arr){
            result+=element;
        }
        return result;
        //System.out.println("Result is : "+result);
    }
    public static void main(String[] args) {
        System.out.println("result is "+sum(2,4));
        System.out.println("result is "+sum());
        System.out.println("result is "+sum(1,2,3,4,5,6,7,8,9));
        System.out.println("result is "+add(2));
        System.out.println("result is "+add(2,45,6));
       // System.out.println(add()); throws error required int,int[]
    }
}
