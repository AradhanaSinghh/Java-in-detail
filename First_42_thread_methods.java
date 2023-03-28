package com.company;
class MyNewThr1 extends Thread{
    @Override
    public void run() {
        int i=0;
      while(i<5){
          System.out.println("Thank you ");
          try {
              Thread.sleep(455);
          }

          catch (InterruptedException e){
              System.out.println("Interrupted!");
          }
          i++;
      }
    }
}
class MyNewThr2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<10) {
            System.out.println("my Thank you ");
            i++;
        }
    }
}
public class First_42_thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1= new MyNewThr1();
        MyNewThr2 t2= new MyNewThr2();
        try {
            t1.join();//may be interrupt so it is stopped
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(t1.getStackTrace());
        t1.start();
        t2.start();
    }
}
