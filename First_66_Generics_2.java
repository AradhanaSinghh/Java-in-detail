package com.company;
import java.util.*;

public class First_66_Generics_2 {
    public static void main(String[] args) {
        List<? extends Number> upperList= Arrays.asList(2,3,4);
        List<? super Number> lowerList= new ArrayList<>();
        List<Integer> noBoundList= new ArrayList<>();

        UpperList(upperList);
        LowerList(lowerList);
        NoBoundList( noBoundList);

    }
    public static void UpperList(List<? extends Number> list) {
        System.out.println("In upperBound");
        for(Number number:list){
            System.out.println(number);
        }
    }
    public static void LowerList(List<? super Number> list) {
        System.out.println("In lowerBound");
        list.add(5.90789867);
        list.add(6.9);
        list.add(6);
        list.add(-6);
        System.out.println("list: " + list);
    }
    public static void NoBoundList(List<Integer> list) {
        System.out.println("In noBoundlist");
        list.add(3);
        list.add(6);
        System.out.println("list: "+list);
    }
}
