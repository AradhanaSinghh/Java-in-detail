package com.company;

public class First_16_arrays {
    public static void main(String[] args) {
        /*
        classroom of 500 students - You have to store marks of these 500 students
        you have 2 options:
        1. Create 500 variables
        2. Use Arrays(recommended)
         */

        /*
        1.Declaration and memory allocation
        int [] marks = new int[5];
        marks[0]=100;
        marks[1]=79;
        marks[2]=89;
        marks[3]=86;
        marks[4]=99;
        marks[4]=100;this will override the prev. value marks[4].
        marks[5]=96; will throw an error bcz memory alloc. is till 5 block.
        System.out.println(marks[4]);

        2. Declaration and then memory allocation
        int [] marks;
        marks=new int[5];
        marks[0]=100;
        marks[1]=79;
        marks[2]=89;
        marks[3]=86;
        marks[4]=99;
         */
//       3. Declaration,memory allocation and initialization together
        int[] marks={98,87,76,65,34};
        System.out.println(marks[2]);
        System.out.println(marks.length);
        float[] mark={98.1f,45.5f,79.9f,80.5f,99.8f};
        System.out.println(mark.length);
        System.out.println(mark[1]);
        //displaying the array(naive way)
        System.out.println("printing using naive way");
        marks[0]=100;
        marks[1]=79;
        marks[2]=89;
        marks[3]=86;
        marks[4]=99;
     //Array traversal
        //displaying the array(for loop)
        System.out.println("Printing using for loop");
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);//0 to n-1
        }

        //displaying the array(for loop) in reverse order
        //quick quiz:
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length-1; i>=0;i--) {
            System.out.println(marks[i]);//0 to n-1
        }
        // *****for-each loop*****
        System.out.println("printing using for-each loop");
        for(int element :marks){
            System.out.println(element);
        }
    }
}
