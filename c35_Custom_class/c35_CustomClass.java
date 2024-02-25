package com.company;
 //public class Employee  -> gives error one java file can have only one public class
/*
Syntax of a custom class :
class <class_name>{
    field;
    method;
}
 */
 class Emp  // by default class is of default type
{
   int id;
   String name;
   int salary;
   public void printDetails()
   {
       System.out.println("id : "+id);
       System.out.println("name : "+name);
   }

   public int getSalary()
   {
        return salary;
   }
}
public class c35_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is my first Custom Class");
        Emp obj = new Emp(); //instantiating a new Employee object
        obj.printDetails();     // if not set by default obj.id = 0 & obj.name = null
        // setting properties
        obj.id=101;
        obj.salary=150000;
        obj.name="ASHWINA RAWAT";
        System.out.println("salary : "+obj.getSalary());
        obj.printDetails();
//        System.out.println(obj.id);
//        System.out.println(obj.name);
        Emp misty = new Emp();
        misty.id=102;
        misty.salary=91000;
        System.out.println("salary : "+misty.getSalary());
        misty.name="MISTY RAWAT";
        misty.printDetails();
    }
}
