package com.company;
class Base1{
    public int x;
    Base1() {
        System.out.println("I am a constructor");
    }

    Base1(int x){
        System.out.println("I am a constructor with value of x : "+x);
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    public int y;
    Derived1(){
        //super(0)
        System.out.println("I am a constructor of a derived class");
    }
    Derived1(int x,int y){
        super(9);
        System.out.println("I am a constructor with value of y : " + y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("i am child of derived constructor");
    }
    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("i am an overload constructor of derived with value of z as: "+z);
        System.out.println("I am done!");
    }
}
public class First_27 {
    public static void main(String[] args) {
        //Base1 b=new Base1();//it will print the value of base1
        //Derived1 d= new Derived1(7,5);//derived will print constructors from start
        childOfDerived e= new childOfDerived(7,5,6);

    }
}
