package com.company;

public class First_66_Garbage_Collector {
    public void finalize(){
        System.out.println("Object is garbage collected");

    }
    public static void main(String[] args) {
        First_66_Garbage_Collector s1=new First_66_Garbage_Collector();
        First_66_Garbage_Collector s2=new First_66_Garbage_Collector();
        s1=null;
        s2=null;
        System.gc();
    }
}
