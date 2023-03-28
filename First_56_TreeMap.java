package com.company;
import java.util.*;
public class First_56_TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> names=new TreeMap<>();//we can use map <String, Integer> names...
        //but as we know navigable set is an interface
        //treemap maintains an order other than hashmap and hashset.

        names.put("A",1);
        names.put("B",2);
        names.put("C",3);
        names.put("D",4);
        names.remove("D");
        System.out.println(names);
        System.out.println(names.entrySet());
        System.out.println(names.keySet());
        for(Map.Entry pairEntry: names.entrySet()){
            System.out.println(pairEntry.getKey() + " : " +pairEntry.getValue());
        }
    }
}
