package com.company;
class MyNewestThr1 extends Thread{
@Override
 public void run(){
    int i=0;
    while(i<12) {
        System.out.println(" Thanks...");
        i++;
    }
  }
}
class MyNewestThr2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<10) {
            System.out.println("my Thank you.. ");
            i++;
        }
    }
}
public class First_42_yield_method {
    public static void main(String[] args) {
        MyNewestThr1 n=new MyNewestThr1();
        MyNewestThr2 p=new MyNewestThr2();
        n.start();
       Thread.yield();//this is similar to join
        p.start();
      //  p.setPriority(Thread.MAX_PRIORITY);
    }
}
