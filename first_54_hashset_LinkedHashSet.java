package com.company;
import java.util.LinkedHashSet;

public class first_54_hashset_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> myHash=new LinkedHashSet<>(6, 1.0f);
        //load= no. of elements/capacity
        //difference between hashset and linkedHashSet is that linkedHashset prints the elements
        //in ascending order
        myHash.add(1);
        myHash.add(2);
        myHash.add(3);
        myHash.add(4);
        myHash.add(5);
        myHash.add(8);
        System.out.println(myHash);
    }
}
