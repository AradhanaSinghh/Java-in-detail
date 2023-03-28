package com.company;
class MyThreadRun implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");

        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
        System.out.println("I am a thread 1 and not a threat");
    }
}
class MyThreadRun2 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a thread 2 and not a threat");
        System.out.println("I am a thread 2 and not a threat");
        System.out.println("I am a thread 2 and not a threat");
        System.out.println("I am a thread 2 and not a threat");
        System.out.println("I am a thread 2 and not a threat");
        System.out.println("I am a thread 2 and not a threat");
        System.out.println("I am a thread 2 and not a threat");
    }
}

class MyThreadRun3 implements Runnable{
    public void run(){
        System.out.println("I am thread 3 and not a threat");
        System.out.println("I am thread 3 and not a threat");
        System.out.println("I am thread 3 and not a threat");
        System.out.println("I am thread 3 and not a threat");
        System.out.println("I am thread 3 and not a threat");
    }
}
public class First_39_runnable_interface {
    public static void main(String[] args) {
        MyThreadRun bullet1= new MyThreadRun();
        Thread gun1 = new Thread(bullet1);
        MyThreadRun2 bullet2= new MyThreadRun2();
        Thread gun2= new Thread(bullet2);
        MyThreadRun3 bullet3=new MyThreadRun3();
        Thread gun3=new Thread(bullet3);

        gun1.start();//runnable interface doesn't give you authority to directly apply start
        gun2.start();
        gun3.start();

    }
}
