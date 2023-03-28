package com.company;

import java.util.*;
//treemap implements navigablemap extends sortedmap extends map
public class First_56_TreeMap_NavigableMap_1 {
    public static void main(String[] args) {
        NavigableMap<String,Integer> naming=new TreeMap<>();
        naming.put("A",1);
        naming.put("B",2);
        naming.put("C",3);
        naming.put("D",4);
        //Maintains descending order
        System.out.println("descendingMap: "+ naming.descendingMap());
        //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("headMap: "+ naming.headMap("C",true));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+ naming.tailMap("A",true));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+ naming.subMap("A", true, "D", true));
        System.out.println("subMap: "+ naming.subMap("A", false, "D", true));
    }
}
