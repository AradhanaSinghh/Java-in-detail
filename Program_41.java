package com.company;
//create a class cylinder and use getter and setters to set its radius and height
//also calculate surface and volume of cylinder
class cylinder{
    private float radius;
    private float height;
    public float getRadius(){
        return radius;
    }
    public void setRadius(float n ){
        this.radius=n;
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float h ){
        this.height=h;
    }
    public double surface(){
        return 2*3.14*radius*height+2*3.14*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;//math.pi is for pi value
    }
}
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        this.length=14;
        this.breadth=13;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth=breadth;
    }
}
public class Program_41 {
    public static void main(String[] args) {
        cylinder c= new cylinder();
        c.setRadius(14);
        c.setHeight(16.9f);
        double sur=c.surface();
        System.out.println(sur);
        double vol=c.volume();
        System.out.println(vol);
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
        Rectangle r= new Rectangle(23,26);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
