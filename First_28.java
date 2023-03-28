package com.company;
class EkClass{
    int a;

    EkClass(int a){
        this.a=a;
    }
    public int getA() {
        return a;
    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c,int i){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class First_28 {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d= new DoClass(2,4);
//        System.out.println(e.getA());
       System.out.println(d.getA());
    }
}
