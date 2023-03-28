package com.company;
class DaemonThread extends Thread{
    public DaemonThread(String name){
        super(name);
    }
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println(getName()+ " is Daemon Thread");
        }
        else{
            System.out.println(getName()+ " is User Thread");
        }
    }
}
public class First_44_daemon{
    public static void main(String[] args) {
        /*
        daemon run in the background of another thread and provide
        services to the threads.
        ex- Garbage collector, Spelling check
         */
        DaemonThread t1= new DaemonThread("t1");
        DaemonThread t2= new DaemonThread("t2");
        DaemonThread t3= new DaemonThread("t3");
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t2.setDaemon(true);//error
        /*
        it will print t2 is user thread and t1 is daemon t1.start();
        but will not print t3 .
         */
        t3.setDaemon(true);
        t3.start();
    }
}
