package com.company;
/*
Static fields - these are the fields declared in the class with a static keyword.
Only one copy of such fields exists in memory and are shared by (or available to) all the instances of that class.
------------------------------------------------------------------------------------------------------------------------
Constants - these are the variables/references declared in the class with both static and final keywords.
Only one copy of such fields exist in memory like the static fields. However,these variables/references cannot be
reassigned another value once they have been assigned a value.
 */

import java.util.*;
class asExample {
    private int v1;
    public int v0;
    private final int v2 = 0;
    private static int v3=8;
    private static final int v4 = 9;
    public void Drum(){
        v0=9;
        v3=9;
        System.out.println(v3);
    }
}
public class First_64_final {
    public static void main(String[] args) {
        asExample a1=new asExample();

    }
}
