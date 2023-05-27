package com.company;
import java.util.Scanner;

public class Program_16 {
    public static void main(String[] args) {
        System.out.println("Enter Marks: ");
        Scanner sc = new Scanner(System.in);
        float Mathematics = sc.nextFloat();
        float Science = sc.nextFloat();
        float English = sc.nextFloat();
        System.out.println("If you are satisfied then type true otherwise false : ");
        boolean b= sc.nextBoolean();
        float avg = (Mathematics+Science+English)/3.0f;
        System.out.println("Your overall percentage : " +avg);
        if(avg>=40 && Mathematics>=33 && Science>=33 && English>=33){
            System.out.println("Congratulations, You have been promoted");
        }
        else{
            System.out.println("Sorry, you have not been promoted! Please try again.");
        }
        if(b==true){
            System.out.println("thank you!");
        }
        else{
            System.out.println("Rechecking your answer sheet..");
        }
    }
}
