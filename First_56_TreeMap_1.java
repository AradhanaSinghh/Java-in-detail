package com.company;
import java.util.*;
public class First_56_TreeMap_1 {
        public static void main(String[] args) {
            // creating tree map
            TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
            // populating tree map
            treemap.put(2, "two");
            treemap.put(1, "one");
            treemap.put(3, "three");
            treemap.put(7, "seven");
            treemap.put(5, "five");
            System.out.println(treemap.entrySet());
            /*a key-value mapping associated with the least key in this map, or null if the map is empty.*/
            System.out.println("First entry: " +treemap.firstEntry());
            /*returns first lowest key*/
            System.out.println("First Key : " +treemap.firstKey());
            System.out.println(treemap.floorEntry(0));
                    /*
                     Returns a key-value mapping associated with the greatest key less than or equal to the given key,
                     or null if there is no such key.
                     */
            System.out.println(treemap.floorEntry(4));
            System.out.println(treemap.floorEntry(5));
            System.out.println("largest value which is lesser than the key value is: " +treemap.floorKey(5));
            System.out.println("largest value which is lesser than the key value is: "+ treemap.floorKey(8));

            System.out.println("*************");

            System.out.println(treemap.lastEntry());
            System.out.println(treemap.lastKey());
            System.out.println(treemap.higherEntry(5));
            System.out.println(treemap.higherKey(6));
            /*
            Returns a key-value mapping associated with the greatest key strictly less than the given key,
            or null if there is no such key.
            */
            System.out.println(treemap.lowerEntry(3));
            /*Returns the greatest key strictly less than the given key, or null if there is no such key.*/
            System.out.println(treemap.lowerKey(4));
            /*
            Returns a key-value mapping associated with the least key greater than or equal to the given key,
            or null if there is no such key.
            */
            System.out.println(treemap.ceilingEntry(4));
            System.out.println(treemap.pollFirstEntry());
            System.out.println(treemap.pollLastEntry());
            //putting values in navigable set
            System.out.println(treemap.navigableKeySet());
            System.out.println(treemap.descendingKeySet());

        }
    }
