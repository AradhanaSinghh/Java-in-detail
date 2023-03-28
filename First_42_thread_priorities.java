package com.company;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());
        //   while(true){
        //    System.out.println("I am a thread");
        // }
    }
}
public class First_42_thread_priorities {
    public static void main(String[] args) {
        //ready queue: T1 T2 T3 T4 T5
        MyThr1 t1=new MyThr1("Aradhana1");
        MyThr1 t2=new MyThr1("Aradhana2");
        MyThr1 t3=new MyThr1("Aradhana3");
        MyThr1 t4=new MyThr1("Aradhana4");
        MyThr1 t5=new MyThr1("Aradhana5 is the most important thread");
        t1.setName("Sita");//it will replace aradhana by sita
      t5.setPriority(Thread.MAX_PRIORITY);
      t2.setPriority(Thread.MIN_PRIORITY);
      t3.setPriority(Thread.MIN_PRIORITY);
      t4.setPriority(Thread.MIN_PRIORITY);
      t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
        System.out.println(t4.getName());
        System.out.println(t5.getName());
//priority NOTE:-***
        /*
        1) MAX priority is 10 so beyond that if you will write priority more than 12 in set priority
        then, it will give you an error Exception in thread "main" java.lang.IllegalArgumentException
	at java.lang.Thread.setPriority(Thread.java:1089)
	at JavaSetPriorityExp5.main(JavaSetPriorityExp5.java:13)
	    2) MIN priority is 1
	    3) NORM priority is 5
         */
    }
}
