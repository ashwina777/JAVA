package com.company;

public class c38_constructors
{
    public static void main(String[] args) {
          MyEmployee1 ash = new MyEmployee1();
          ash.setId(21);
          ash.setName("abc");
          ash.showData();
          MyEmployee1 a = new MyEmployee1("ashwina",101);
          a.showData();
          MyEmployee1 b = new MyEmployee1("ashwina_rawat");
          b.showData();
    }
}
class MyEmployee1
{
    private int id;
    private String name;
    // constructor -> which is a member function used to initialize an object while creating it
    // constructor overloading :-
    public MyEmployee1()
    {
        id = 211;
        name = " ABC ";
    }
    public MyEmployee1(String n, int i)
    {
        id = i;
        name = n;
    }
    public MyEmployee1(String n)
    {
        id = 0;
        name = n;
    }
    public void setId(int i){  this.id=i;  }
    public void setName(String n){  this.name=n; }
    public void showData()
    {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
    }
}
