package com.company;
class Thr1 implements Runnable{
    @Override
    public void run() {
        System.out.println("running..");
    }
}
public class First_41_threadclass_and_threadgroup_practice {
    public static void main(String[] args) {
        Thr1 thr1=new Thr1();
        ThreadGroup a1=new ThreadGroup("Group1");
        ThreadGroup a2=new ThreadGroup("Group2");
        ThreadGroup a3=new ThreadGroup("Group3");

        Thread t1=new Thread(a1,thr1,"T1");
        Thread t2=new Thread(a2,thr1,"Maa");
        Thread t3=new Thread(a3,thr1,"T2");

        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t1.toString());


    }
}
