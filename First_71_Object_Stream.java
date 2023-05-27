package com.company;

import java.io.*;

class K20RGStudent implements Serializable{
    String name;
    int rno;
    public  K20RGStudent(String n,int r){
        this.name=n;
        this.rno=r;
    }
    public void print(){
        System.out.println("Name: "+name+" Rollno.: "+rno);
    }
}
public class First_71_Object_Stream {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
      K20RGStudent std1=new K20RGStudent("sheetal",12);
      FileOutputStream obj1=new FileOutputStream(new File("C://Users//Aradhana Singh//OneDrive//Desktop//a1.txt"));
      ObjectOutputStream oos=new ObjectOutputStream(obj1);
      oos.writeObject(std1);
      oos.flush();
      oos.close();
      FileInputStream fin=new FileInputStream(new File("C://Users//Aradhana Singh//OneDrive//Desktop//a1.txt"));
      ObjectInputStream obj2=new ObjectInputStream(fin);
      K20RGStudent s1=(K20RGStudent)obj2.readObject();
      s1.print();
      obj2.close();

    }
}
