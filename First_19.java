package com.company;

public class First_19 {
    static void foo(){
        System.out.println("Good morning bro!🌸");
    }
    static void foo(int a){
        System.out.println("Good morning +a+ bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, String b, int c) {
        System.out.println("Good morning " + a + b+ c +" bro!");
        System.out.println("Good morning " + a + " bro!");
    }

        static void change(int a){
            a=98;
        }
        static void change2(int[] arr){
            arr[0]=98;
        }

        static void tellJoke(){
            System.out.println("You are half crack like an egg! ");
        }

    public static void main(String[] args) {
        tellJoke();

        //case1- changing the integer
        int x=45;
        change(x);
        System.out.println("the value of x after change is : " + x);

        //case2-Changing the array
        int[] marks={52,34,56,78,98};
        change2(marks);
        System.out.println("the value of x after change is : " + marks[0]);// giving reference change the value
   //method overloading
        foo();
        foo(3000);
        foo(3000, "hi",5);
        // Arguments are actual!
        //parameters are the value assigned in a method.
        // method or (function) where method is used oops in java but the meaning is same
    }
}
