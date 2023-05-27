package com.company;
class Outer
{

    int a;
    public void show(){
    }

    class Inner{ //file name-- Outer$Inner.class
        public void display(){
            System.out.println("In display");
        }
    }

}
public class First_65_Inner_class {
    public static void main(String[] args) {
        Outer obj=new Outer();
    //    obj.show();
        Outer.Inner obj1=obj.new Inner(); //to access the object is by using outer class object
        obj1.display();
    }
}
