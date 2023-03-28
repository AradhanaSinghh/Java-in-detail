package com.company;
import java.util.Scanner;

class MyException extends Exception{
    public String toString() {
        return "I am toString()";
    }
    public String getMessage() {
        return "I am getMessage()";
    }
}
public class First_47_exception_class {
    public static void main(String[] args) {
        int a=8;
        if(a<9){
            try {
               throw new MyException();
//              throw new ArithmeticException("This is an exception");
            }
            catch(Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();//used to tell error is present in which line
                System.out.println("Finished");
                System.out.println("Yes Finished");
            }
        }
        else{
            System.out.println("Number is greater than 99!");
        }
    }
}
