package com.company;

import java.util.*;
class MyGenerics<T1,T2>{
    int val;
    private  T1 t1;
    private  T2 t2;

    public MyGenerics(int val, T1 t1,T2 t2){
        this.val=val;
        this.t1=t1;
        this.t2=t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class First_66_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
       //int is primitive so can't be used
        arrayList.add(54);
        arrayList.add(543);
        //arrayList.add(new Scanner(System.in));
        System.out.println(arrayList);
        //int a=(int) arrayList.get(2);
        MyGenerics<String,Integer> g1=new MyGenerics(23,"MyString",45);
        String str= g1.getT1();
        Integer int1= g1.getT2();
        System.out.println(str);
        System.out.println(int1);
    }
}
