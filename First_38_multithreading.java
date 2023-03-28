package com.company;
class MyThread extends Thread{
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("My cooking thread is running");
            System.out.println("I am delightful! to use java");
       i++;
        }
    }
}
class MyThread3 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Hi! thread 3 is running");
        i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("My chatting thread2 is running");
            System.out.println("I am using java for creating Mythread2....");
        i++;
        }
    }
}
public class First_38_multithreading {
    public static void main(String[] args) {
        //concurrency and parallelism
        /*
        concurrency is the task of running and managing the multiple computations
        at the same time.
        parallelism is the task of running multiple computations simultaneously.
         */
        MyThread t1= new MyThread();
        MyThread2 t2=new MyThread2();
        MyThread3 t3=new MyThread3();

        t1.start(); //start is a run method for multithreading
        t2.start();
        t3.start();
    }
}
