package com.company;
class Phone{
    public void showTime(){
        System.out.println("Time is 6:00a.m...");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("playing music...swag se swagat!..");
    }
    public void on(){
        System.out.println("Turning on smart phone....");
    }
}
public class First_30_dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj=new SmartPhone();//Yes ,it is allowed
        //SmartPhone obj2=new Phone();//not allowed
        obj.showTime();
        obj.on();//object will run not reference
       /*
         obj.music();--will give you an error!
        smartphone ko phone bol sakte hai but phone ko app smartphone bula nhi skte
        simply-
        */
        /*
        super obj=new sub()--allowed!         */
    }
}
