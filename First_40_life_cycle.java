package com.company;
//life cycle-new, runnable,running, non-running, terminate
class MyThr extends Thread{
    String name;
    MyThr(String n){
        this.name=n;
    }

    @Override
    public void run() {
        int i=38;
        System.out.println("Thank you ");
         //   while(true){
        //    System.out.println("I am a thread");
       //
        // }

    }
}
class MyThr4 extends Thread{
    int age;
    MyThr4(int age){
        this.age=age;
    }
}
public class First_40_life_cycle {
    public static void main(String[] args) {
        //constructors
        MyThr t=new MyThr("Aradhana");
        MyThr t2=new MyThr("Ryan");
        MyThr4 t3=new MyThr4(18);
        t.start();
      //t.start();
        /*
        thread will run once but for second time, it will throw exception.
        Exception in thread "main" java.lang.IllegalThreadStateException
        */
        t2.start();
        System.out.println("The id of t is: "+t.getId());
        System.out.println("The id of t is: "+t.getName());
        System.out.println("The id of t2 is: "+t2.getId());
        System.out.println("The id of t2 is: "+t2.getName());
        System.out.println(t3.getName());
    }
}
