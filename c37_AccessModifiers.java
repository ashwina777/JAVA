package com.company;
class MyEmployee
{
    private int id;
    private String name;
    public void setId(int i)
    {
        id=i;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void showData()
    {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
    }
}
public class c37_AccessModifiers
{
    public static void main(String[] args) {
        MyEmployee ash = new MyEmployee();
//        ash.id=101;       --> throws error java: id has private access in com.company.MyEmployee
//        ash.name="ashwina";  -> private var can be only accessed through methods which promotes data hiding
          ash.setId(101);
          ash.setId(102);
          ash.setName("ashwina");
          //ash.setName(348); throws error as data type mismatched
          ash.showData();
    }
}
