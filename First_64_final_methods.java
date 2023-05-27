package com.company;
//In Java, when we do not want a class to ever have subclasses, we declare that class as final.
class Baap{
    public void method1(){
    }
    public final void method2(){
    }
    public void method3(){
    }
}
class beta extends Baap{
    public void method1(){
    }
//    public void method2(){
//    }
    public final void method3(){
    }
}
public class First_64_final_methods {
    public static void main(String[] args) {

    }
}
