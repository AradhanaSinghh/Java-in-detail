package com.company;

class Outer1
{
    static int a;
    public static void show(){
    }
    static class Inner1{
        public void display(){
            System.out.println("In display");
        }
    }
}
public class First_65_Inner_class_2 {
    public static void main(String[] args) {
        Outer1 obj=new Outer1();
        //    obj.show();
        Outer1.Inner1 obj1=new Outer1.Inner1();
        obj1.display();
    }
}
