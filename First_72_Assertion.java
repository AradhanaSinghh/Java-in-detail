package com.company;

public class First_72_Assertion {
    public static void main(String[] args) {
        int x = getPositiveInt(7);
        int y = getPositiveInt(1);
        assert (x>0);
        assert (y>0);
        int total=x+y;
        System.out.println("total: "+total);

    }
    public static int getPositiveInt(int num){
        return num - 3;
    }
}
