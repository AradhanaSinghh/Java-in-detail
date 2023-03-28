package com.company;
import java.util.*;
public class First_52_linkedlist_collection {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();//not has an initial capacitor as arraylist
        l2.add(15);
        l2.add(60);
        l2.add(40);
        l2.add(19);
        l1.add(2);
        l1.add(7);
        l1.add(4);
        l1.add(7);
        l1.add(0,6);
        l1.add(0,2);
        l1.addAll(0,l2);
        l1.addFirst(100);
        l1.addLast(200);
        l1.removeFirstOccurrence(7);
        //l1.removeFirst();
        //l1.removeLast();
       // l1.poll();
        //l1.pollFirst(); -- also removes the first element
        //l1.pollLast(); -- also remove the last element
        l1.removeIf(e->e.equals(4));
        l1.offer(9);
        System.out.println("First : " +l1.getFirst());
        System.out.println("First : " +l1.peekFirst());//another way to get the first element

        System.out.println("Last : " +l1.getLast());
        System.out.println("Last : " +l1.peekLast());
        LinkedList<Integer> l3=new LinkedList<>();
        l3=(LinkedList)l1.clone();
        //l1.clear();//after clear method no output will be printed even clone
        //will also not give any output
        System.out.println(l1);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(7));
        System.out.println("last index of 7 would be: "+ l1.lastIndexOf(7));
        System.out.println("Here you can see value is going out of range so: " +l1.indexOf(57)+ " would be printed");

        LinkedList<Integer> l4=new LinkedList<>();
        l4.add(6);
        l4.add(9);
        //l1.set(0,0);//print 0 at 0th index
        System.out.println("print true if empty otherwise false? : "+ l4.isEmpty());
      //  System.out.println("removing an element from l1: "+ l1.remove(2));
       // l1.removeAll(l2);//boolean type
// System.out.println(l1.peek());will give the first value only
        for(int i=0; i<l1.size();i++){
            System.out.print(l1.get(i));
            if(i<(l1.size()-1))
                System.out.print(",");
        }
    }
}

