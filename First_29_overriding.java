package com.company;
class A{
    public int a;
    public int aradhana(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
    //method overloading- means method names are same but parameters are assigned differs
    //method overriding-means we are creating the same method,
    // but it is overriding the previous one by changing the value of other
}
class B extends A{
    @Override//--used to depict an override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }

    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class First_29_overriding {
    public static void main(String[] args) {
     A a=new A();
      a.meth2();
        B b=new B();
        b.meth2();
    }
}
/*
Previous topics
static
inheritance
constructors
overloading
overriding

 */