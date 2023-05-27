package com.company;
/*
Create a class rectangle and use inheritance to create another class cuboid,
try to keep it as close to the real-world scenario as possible

create methods for area & volume in 2 also create getters and setters
 */
class Rectangle1{
    int length;
    int breadth;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    Rectangle1(int length,int breadth){
        this.length=length;
        System.out.println("length: "+length);
        this.breadth=breadth;
        System.out.println("breadth: "+breadth);
    }
    public double area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle1{
    int height;
    Cuboid(int l,int b, int h){
        super(l,b);
        this.height=h;
        System.out.println("height "+ height);
    }
    public double volume(){
        return length*breadth*height;
    }
}
public class Program_43 {
    public static void main(String[] args) {
        Cuboid c=new Cuboid(4,5,9);
        double v= c.volume();
        System.out.println("The volume is :" + v);
    }
}
