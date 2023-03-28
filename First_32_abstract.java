package com.company;
//abstract means something that doesn't exist in reality(khayali pulao)
//if something you thought is happening in reality then it is concrete.
abstract class Parent2{
    Parent2(){//constructor should not be used as void parent2()
        System.out.println("I am base2 constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();//will make a lot of classes
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet() {
        System.out.println("Good Morning!");
    }
    public void greet2() {
        System.out.println("Good Evening!");
    }
}
abstract class child3 extends Parent2{//standard se standard
    public void greeting(){
        System.out.println("I am good");
    }
}
public class First_32_abstract {
    public static void main(String[] args) {
        /*
        Parent2 p=new Parent2() {
        }as parent2 is an abstract class
         */
        //Child3 ch=new child3();//---error
        Child2 c =new Child2();
         c.greet();
         c.greet2();
    }
}
