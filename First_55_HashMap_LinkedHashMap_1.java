package com.company;

import java.util.*;

public class First_55_HashMap_LinkedHashMap_1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> myH=new LinkedHashMap<>();
        //load= no. of elements/capacity
        //difference between hashset and linkedHashSet is that linkedHashset prints the elements
        //in ascending order
        myH.put(1,"A");
        myH.put(2,"B");
        myH.put(3,"C");
        myH.put(4,"D");
        myH.put(5,"F");
        myH.put(8,"E");
        System.out.println(myH);
    }
}
