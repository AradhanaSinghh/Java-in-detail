package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class First_50_collections{
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l1.add(2);
        l1.add(7);
        l1.add(4);
        l1.add(7);
        l1.remove(l1.size() -1);
        System.out.println(l1);
        l1.add(0,6);
        l1.add(0,2);
        l1.addAll(0,l2);
        ArrayList<Integer> l3=new ArrayList<>();
        l3=(ArrayList)l1.clone();
        //l1.clear();//after clear method no output will be printed even clone
        //will also not give any output
        System.out.println(l1);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(7));
        System.out.println("last index of 7 would be: "+ l1.lastIndexOf(7));
        System.out.println("Here you can see value is going out of range so: " +l1.indexOf(57)+ " would be printed");

        ArrayList<Integer> l4=new ArrayList<>();
        l4.add(6);
        l4.add(9);
        l1.set(0,0);//print 0 at 0th index
       // l1.trimToSize();//Trims the capacity of this ArrayList instance to be the list's current size.
        System.out.println("print true if empty otherwise false? : "+ l4.isEmpty());
        System.out.println("removing an element from l1: "+ l1.remove(2));
        //l1.removeAll(l2);//boolean type
        for(int i=0; i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
            //System.out.println(l3.get(i));
        }
    }

}
