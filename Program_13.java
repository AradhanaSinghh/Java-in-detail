package com.company;
//Write a Java program to fill in a letter template which looks like below:
// letter = “Dear <|name|>, Thanks a lot”
// Replace <|name|> with a string (some name)
public class Program_13 {
    public static void main(String[] args){
        String a = "Dear <| name |>, Thanks a lot";
        System.out.println(a.replace("name","Aradhana"));
    }
}
