package com.company;
class JavaSetPriorityExp4 extends Thread{
         public void run()
        {
        System.out.println("running...");
        }
}
public class First_42_thread_priorities_part_2 {
    public static void main(String[] args) {
        // creating one thread
        JavaSetPriorityExp4 t1=new JavaSetPriorityExp4();
        JavaSetPriorityExp4 t2=new JavaSetPriorityExp4();
      //  JavaSetPriorityExp4 t3=new JavaSetPriorityExp4();
        // set the priority
        t1.setPriority(4);
        t2.setPriority(7);
        t1.start();

      /*t3.setPriority(12);*/
        // print the user defined priority
        System.out.println("Priority of thread t1 is: " + t1.getPriority()); //4
        System.out.println("Priority of thread t2 is: " + t2.getPriority()); //7
        //System.out.println("Priority of thread t3 is: " + t3.getPriority()); //error
        // this will call the run() method

    }
}
