package com.company;
//@FunctionalInterface --ek hi method ho toh woh hai hamara functional interface
interface myFuncInterface{
/*    default void thisMethod(){
        showTym();
        System.out.println("I am a default method");
    }
    private void showTym(){
        System.out.println("Time is 9:00pm");
    }*/
    void ekHiMethod();
}
/*class F1 implements myFuncInterface{
    public void thisMeth1(){
        System.out.println("I am meth1");
    }
    public void greet(){
        System.out.println("hi");
    }
}
class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 9:00pm");
    }*/


//suppress warning
class supressedWarning{
    @Deprecated
    public int summing(int a, int b){
        return a+b;
    }
}

public class First_68_java_annot {
    public static void main(String[] args) {
/*       @SuppressWarnings("deprecated")
        supressedWarning warn=new supressedWarning();
        phone.showTime();
           warn.summing(5,6);//will not be used longer after deprecated annotation.
        F1 n = new F1();
        n.thisMeth1();
        n.greet();
        n.thisMethod();*/
    }
}
