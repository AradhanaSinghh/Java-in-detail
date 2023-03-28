package com.company;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class First_57_TreesSet {
    public static void main(String[] args) {
        TreeSet<String> a1=new TreeSet<String>();
        a1.add("Raj");
        a1.add("Raj");
        a1.add(" ");
        a1.add("Raja");
        a1.add("Rajama");
        a1.add("Rajamana");
        System.out.println(a1);
        System.out.println(a1.size());
        Iterator<String> itr=a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println((Set<String>)a1.headSet("Rajama"));
        System.out.println((Set<String>)a1.tailSet("Rajama"));
    }
}
