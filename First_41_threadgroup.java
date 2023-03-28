package com.company;
class Myt implements Runnable{
    public void run(){
        System.out.println("run....");
    }
}
public class First_41_threadgroup {
    public static void main(String[] args) {
        Myt r= new Myt();
        ThreadGroup groupA= new ThreadGroup("groupA");
        ThreadGroup groupB= new ThreadGroup("groupB");
        ThreadGroup groupC=new ThreadGroup("groupC");

        Thread gun1= new Thread(groupA,r,"T1");
        Thread gun2= new Thread(groupA,r,"T2");
        Thread gun3= new Thread(groupA,r,"T3");
        Thread gun4= new Thread(groupA,r,"T4");
        Thread gun5= new Thread(groupB,r,"T5");
        Thread gun6= new Thread(groupB,r,"T6");
        Thread gun7=new Thread(groupC,r,"T7");

        gun1.start();
        gun2.start();
        gun3.start();
        gun4.start();
        gun5.start();
        gun6.start();
        gun7.start();
       /* firstly, the below given code will be executed .*/
        System.out.println(gun1.getName());
        System.out.println(gun2.getName());
        System.out.println(gun3.getName());
        System.out.println(gun4.getName());
        System.out.println(gun5.getName());
        System.out.println(gun6.getName());
        System.out.println(gun7.getName());
        System.out.println(gun1.getThreadGroup().getName());//will return the name of the group which t1 belongs to
        System.out.println(gun1.getState());
        System.out.println(gun2.getContextClassLoader());

    }
}
