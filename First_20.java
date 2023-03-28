package com.company;

public class First_20 {

        //public static void foo(int ...arr)
        //{
        // arr is available here as int[] arr
        //
        // }

        static int add(int ...arr){//dry method
            //Available as int[] arr;
            int result=0;//initially
            for(int a: arr){
                result +=a;
            }
            return result;
        }

        static int multiply(int ...arr){
            int mult=1;
            for(int b:arr){
                mult*=b;
            }
            return mult;
        }

        static int divide(int ...arr){
            int divide=1;
            for(int s: arr){
                divide%=s;
            }
            return divide;
        }


    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println(add(1, 2));
        System.out.println(add(2, 3, 4));
        System.out.println(add(4, 5, 6));
        System.out.println(divide(2,4));
        System.out.println("multiplication of 4 and 7 is: "+ multiply(4, 7));

    }
}
