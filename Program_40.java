package com.company;
class CellPhone {
    public void ring() {
        System.out.println("ringing....");
    }

    public void vibrate() {
        System.out.println("vibrating...");
    }

    public void makingCall() {
        System.out.println("Calling Sanya...");
    }
}
class Circle{
    float side;
    public float area(){
        float radius=side/2;
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        float radius=side/2;
        return 2*3.14f*radius;
    }
}
public class Program_40{
    public static void main(String[] args) {
        //problem-2
        // Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
        CellPhone asus = new CellPhone();
        asus.ring();
        asus.vibrate();
        asus.makingCall();
        Circle c= new Circle();
        c.side=4;//giving the value as 4
        float s= c.area();// assigning s as c.area() to call the method
        System.out.println(s);

    }
}

