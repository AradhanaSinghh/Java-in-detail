package com.company;
//interface- 1) interface can't make object
//we use implements in interface and not extends
interface Bicycle{
    //all the properties in interface are final.
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int x=45;
    void blowHornK3g();
    void blowHornMhn();
}
class AvonCycle implements Bicycle, HornBicycle{
    //public int x =5;
    void blowHorn(){
        System.out.println("Pee pee poo poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){//by default public
        System.out.println("Speed Up");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi Gam pee pee pee pee");
    }
    public void blowHornMhn(){
        System.out.println("main hoon na poo poo poo poo");
    }
}
public class First_33_interface {
    public static void main(String[] args) {
        AvonCycle cycle= new AvonCycle();
        cycle.applyBrake(1);
        //you can create properties in interface
        System.out.println(cycle.a);
        //you can't modify the properties in interfaces as they are final
        //cycle.a=454;--error
        //System.out.println(cycle.a);
        cycle.blowHornK3g();
        cycle.blowHornMhn();
        System.out.println(cycle.x);
    }
}
