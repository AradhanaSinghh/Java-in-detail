package com.company;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class First_67_FileHandling {

    public static void main(String[] args) {
       /* File myFile=new File("CreatingFile18");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }*/

        //Code to write
       /* try {
            FileWriter fw=new FileWriter("CreatingFile18.txt");
           fw.write("This is our First File");
           fw.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }*/
        //reading a file
       /* File myFile=new File("CreatingFile18.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        //deleting a file
        File myFile=new File("CreatingFile18.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: "+ myFile.getName());
        }
        else{
            System.out.println("Some problem occured!");
        }
    }
}
