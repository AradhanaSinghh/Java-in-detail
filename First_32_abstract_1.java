package com.company;
abstract class Phone1{
    public Phone1(){
        System.out.println("Switch On....");
    }
    abstract public void Messenger();
    abstract public void Camera();
}
abstract  class pc extends  Phone1{
    abstract public void Welcome();
}
class SmartPhone1 extends pc{//concrete class
    public void Messenger(){
        System.out.println("Explore the world with Vivo!");
    }
    public void Camera(){
        System.out.println("Turning on the camera..."+" \n photo clicked! and saved in the gallery");
    }
    public  void Welcome(){
        System.out.println("welcome");
    }
        }
public class First_32_abstract_1 {
    public static void main(String[] args) {
        SmartPhone1 s= new SmartPhone1();
        s.Welcome();
        s.Messenger();
        s.Camera();

    }
}
