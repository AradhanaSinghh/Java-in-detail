package com.company;
/*
Create an abstract class pen with methods write () and refill () as abstract methods
Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
 */
abstract class pen{
    abstract public void write();
    abstract public void refill();
}
class FountainPen extends pen{
    public void write(){
        System.out.println("learn and grow from the things you go through!");
    }
    public void refill(){
        System.out.println("Refilling....");
    }
    public void changeNib(){
        System.out.println("change the nib...");
    }
}
public class Program_44 {
    public static void main(String[] args) {
        FountainPen trimax=new FountainPen();
        trimax.write();
        trimax.refill();
        trimax.changeNib();
    }
}
