package com.company;
/* rock,paper,scissor */
import java.util.Random;
import java.util.Scanner;
public class Program_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors: ");
        int userInput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);
        Boolean flag = false;
            if (computerInput == userInput) {
                System.out.println("Draw!");
                flag=true;
            }
            else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
                System.out.println("***You Win!***");
                flag=true;
            }
            else if (computerInput == 0 && userInput == 2 || computerInput == 1 && userInput == 0 || computerInput == 2 && userInput == 1) {
                System.out.println("Computer win");
                flag=true;
            }
            else {
                System.out.println("Check the input again!");
                flag=false;
            }

        if(flag==true) {
            if (computerInput == 0) {
                System.out.println("computer input: Rock ");
            } else if (computerInput == 1) {
                System.out.println("computer input: Paper ");
            } else if (computerInput == 2) {
                System.out.println("computer input: Scissors ");
            }
        }
        }
    }
