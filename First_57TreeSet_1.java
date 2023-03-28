package com.company;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class First_57TreeSet_1 {
    public static void main(String[] args) {
        TreeSet<Integer> a1=new TreeSet<>();
        a1.add(7);
        a1.add(8);
        a1.add(3);
        a1.add(1);
        System.out.println(a1);
        System.out.println(a1.size());
        /*
    Retrieves and removes the first (lowest) element,
    or returns null if this set is empty.
        */
        System.out.println(a1.pollFirst());
        /*
        Retrieves and removes the last (highest) element,
         or returns null if this set is empty.
         */
        System.out.println(a1.pollLast());
        System.out.println(a1.isEmpty());
        System.out.println(a1.descendingSet());
        System.out.println(a1.clone());
        System.out.println(a1.floor(4));
        Iterator i=a1.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
