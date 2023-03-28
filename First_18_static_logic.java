package com.company;
public class First_18_static_logic {
    static int logic(int x,int y) {
        //In java in spite of using functions we use static keyword.
        //static-if you are calling an object in main method then you should use static
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + 5) * 5;
        }
        x = 566;
        System.out.println(x);// using x value doesn't affect the main method value
        return z;
    }

    static String fruits(String f1,String f2){
        if(f1.equalsIgnoreCase("Apple")){
            System.out.println("apple is good for health");
        }
        else{
            System.out.println("have fruits daily");
        }
        return f1; //used if we want nothing as a return
    }

    static int add(int x,int y){
        int z=x+y;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation
        //First_18 obj = new First_18();
        //c = obj.logic(a, b)
        //using object as a reference then there is no need of using static
        c=logic(a,b);
        System.out.println(a + " "+ b);
        System.out.println(c);
        int a1 = 566;
        int b1 = 1;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);
        String d1=fruits("Apple","guava");
        System.out.println(d1);
        int addition=add(4,5);
        System.out.println(addition);
    }
}

