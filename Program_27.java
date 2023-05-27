package com.company;
import java.util.*;

public class Program_27 {
    public static void main(String[] args) {
        int[] marks = {9, 8, 7, 2, 3};
        int num = 8;
        boolean isInArray = false;
        for (int element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("the value is present in the array");
        } else {
            System.out.println("the value is not present in the array");
        }

    }
}
