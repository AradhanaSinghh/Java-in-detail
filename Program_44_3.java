package com.company;
/*
Create a class telephone with ring( ) , lift ( ) and disconnected ( ) methods as abstract methods
create another class smart telephone and demonstrate polymorphism
 */

abstract class details{

    abstract public void ring();
    abstract public void lift();
    abstract public void disconnected();

}
class Telephone{
    void ring(){
        System.out.println("Ringing..");
    }
    void lift(){
        System.out.println("lift...");
    }
    void disconnected(){
        System.out.println("disconnected...");
    }
}
class SmartTelephone extends Telephone{
    void picked(){
        System.out.println("Your call has been picked by the user..");
    }
}
public class Program_44_3 {
    public static void main(String[] args) {
        Telephone t= new SmartTelephone();
        //t.picked;
        t.ring();
        t.lift();
        t.disconnected();
    }
}
