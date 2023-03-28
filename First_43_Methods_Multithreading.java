package com.company;
class MySecondThread extends Thread{
    @Override
    public void run() {
        System.out.println("run......");
    }
}
public class First_43_Methods_Multithreading {
    public static void main(String[] args) {
        MySecondThread t1=new MySecondThread();
        System.out.println("Status:"+t1.isAlive());
        t1.start();
        System.out.println("Status:"+t1.isAlive());
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
