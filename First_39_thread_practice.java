package com.company;
class threading implements Runnable {
    public void run(){
        System.out.println("I am the thread which is running right now.");
    }
}
class threading1 extends Thread{
    public void run(){
        int j=0;
        while(j<10){
            System.out.println("I am second thread");
        }
    }
}

public class First_39_thread_practice {
    public static void main(String[] args) {
        threading t=new threading();
        Thread gun=new Thread(t);
        gun.start();

    }
}
