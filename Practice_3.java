package com.company;
class practicing{
     void disp(){
         synchronized(this){
        Thread o=Thread.currentThread();
        for(int i=0;i<=5;i++) {
            try {
                Thread.sleep(20);
                System.out.println("Sleeping Mode...");
            } catch (Exception e) {
                System.out.println(e);
            }
            }
        }
    }
}
class exec extends Thread{
    practicing r;
    exec(practicing r){
        this.r=r;
    }
    public void run(){
        r.disp();
        System.out.println("welcome ..");
    }
}

public class Practice_3 {
    public static void main(String[] args) {
        practicing t= new practicing();
        exec t1=new exec(t);
        exec t2=new exec(t);
        exec t3=new exec(t);
        t1.start();
        t2.start();
        t3.start();
    }
}
