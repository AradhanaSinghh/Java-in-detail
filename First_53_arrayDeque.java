package com.company;

import java.util.*;

public class First_53_arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> t1= new ArrayDeque<>(2);
        t1.add(6);
        t1.add(56);
        System.out.print(t1.peekFirst()+ " ");
        System.out.println(t1.getFirst());
        System.out.print(t1.getLast() + " ");
        System.out.println(t1.peekLast());
    }
}
