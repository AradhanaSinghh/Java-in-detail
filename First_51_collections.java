package com.company;
import java.util.*;
public class First_51_collections  extends ArrayList {
    public static void main(String[] args) {
        First_51_collections l6 = new First_51_collections();
        First_51_collections l9 = new First_51_collections();
        l6.add(7);
        l6.add(8);
        l6.add(3);
        l6.add(10);
        l6.add(12);
        l9.add(10);
        l9.add(12);
        l6.removeRange(0,2);//n-1 -- 2-1 -- 7 and 8 would be printed
        System.out.println(l6);
        l9.retainAll(l6);
        Object[] l0 = l6.toArray();

        System.out.println("Elements of ArrayList"  + " as Array: " + Arrays.toString(l0));
        System.out.println("Elements of ArrayList"  + " as Array: " + Arrays.binarySearch(l0,3));
        for(int i=0; i<l6.size(); i++) {
           System.out.print(l6.get(i));
            System.out.print(",");
           /*System.out.println(l9.get(i));*/
        }
    }
}
