package com.company;
/*
Create a class monkey with jump ( ) and bite ( ) methods.Create a class human which inherits
this monkey class and implements basic animal interface with eat ( ) and sleep methods
 */
interface animal{
    void eat();
    default void sleep(){
        System.out.println("sleep!");
    }
}
class Monkey{
    void jump() {
        System.out.println("jump!");
    }
    void bite(){
        System.out.println("bite!");
    }
}
class human extends Monkey implements animal{
    @Override
    public void eat() {
        System.out.println("Eat!");
    }
}
public class Program_44_2 {
    public static void main(String[] args) {
        Monkey h=new human();
        //human h=new human();--will not give an error
        //h.eat();--error
       // h.sleep();
        h.jump();
        h.bite();

    }
}
