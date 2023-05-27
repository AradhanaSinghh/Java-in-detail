package com.company;
import java.io.*;
public class First_70_characterStream {
    public static void main(String[] args) throws IOException,FileNotFoundException {
                File ob1=new File("C://Users//Aradhana Singh//OneDrive//Desktop//a1.txt");
                File ob2=new File("C://Users//Aradhana Singh//OneDrive//Desktop//a2.txt");
                FileInputStream fin=new FileInputStream(ob1);
                FileOutputStream fout=new FileOutputStream(ob2);
                int i=0;
                do
                {
                    i=fin.read();
                    fout.write(i);
                } while(i!=-1);
                fin.close();
                fout.close();
    }
}
