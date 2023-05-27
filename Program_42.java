package com.company;
/*
1)Create a class circle and use inheritance to create another class cylinder from it
2)Create a method for area and volume in 1
 */
class myCircle {
    int radius;
    myCircle(int radius) {
        System.out.println("I am circle parameterized constructor.");
        this.radius = radius;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class myCylinder extends myCircle{
    int height;
    myCylinder(int r,int h) {
        super(r);
        System.out.println("I am cylinder1 parameterized constructor.");
        this.height=h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Program_42 {
    public static void main(String[] args) {
        myCylinder c=new myCylinder(4,5);
        double d= c.volume();
        System.out.println(d);
    }
}
/*
mcq:-
What is the order of constructor execution for the following inheritance hierarchy
                    Base

                   Derived 1

                   Derived 2

Derived obj = new Derived 2( );
Which constructor(s) will be executed & in what order?

ans:= 1)base
2)derived1
3)derived2
 */
