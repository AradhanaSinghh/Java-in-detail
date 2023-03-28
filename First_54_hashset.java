package com.company;

import java.util.*;

public class First_54_hashset {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet=new HashSet<>(6, 1.0f);
        //load= no. of elements/capacity
        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(5);
        myHashSet.add(8);
        //myHashSet.add(11);-- no duplication
       // myHashSet.clear();
        System.out.println(myHashSet);
        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet.contains(9));
        myHashSet.remove(8);
        System.out.println(myHashSet.hashCode());
        HashSet<Integer> myHashSet_1=new HashSet<>();
        myHashSet_1 = (HashSet)myHashSet.clone();
        System.out.println(myHashSet);
        System.out.println(myHashSet_1);
    }
}
