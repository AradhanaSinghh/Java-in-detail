package com.company;

public class First_46_exception_handling {
    public static void main(String[] args) {
        int a=6890;
        int b=0;
        //without try
       // int c= a/b;
        //System.out.println("The result is: "+c);
        //here the execution will stop!
        try{
            int c=a/b;
            System.out.println("The result is" + c);
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason:");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
