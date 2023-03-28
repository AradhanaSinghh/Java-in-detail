package com.company;
import java.util.Scanner;
class MeraException extends Exception{
    public String toString(){
        return "radius large";
    }
}
public class First_45Exceptions_practice{
    public static int radius(int a) throws MeraException{
        if(a>10){
            throw new MeraException();
        }
        int b=10+a;
        return b;
    }
    public static void main(String[] args){
        try{
            int c=radius(19);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
