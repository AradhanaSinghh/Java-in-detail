package com.company;
import java.util.Random;
import java.util.Scanner;
class Game1{
    Scanner sc=new Scanner(System.in);
    int number;
    int input_number;
    int number_of_guesses=0;
    public void setNumber_of_guesses(int number_of_guesses){
        this.number_of_guesses=number_of_guesses;
    }
    public int getNumber_of_guesses(){
        return number_of_guesses;
    }
    Game1(){
        Random rand=new Random();
        number=rand.nextInt(100);
    }
    public void takeUserInput(){
        System.out.println("enter the number");
        input_number=sc.nextInt();
    }
    public boolean number_guesses(){
        number_of_guesses++;
        if(input_number==number){
            System.out.println("Congrats...the number matches with the computer guessed number with "+ number_of_guesses +" attempts!");
            return true;
        }
        else if(input_number>number){
            System.out.println("too much");
        }
        else if(input_number<number){
            System.out.println("too less");
        }
        return false;
    }
}

