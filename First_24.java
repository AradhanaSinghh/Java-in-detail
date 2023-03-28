package com.company;
class myEmployee{
    private int id;
    private String name;
    private String Class_1;

    public void setClass_1(String c){
        Class_1=c;
    }

    public String getClass_1(){
        return Class_1;
    }
    public void setName(String n){
        name=n;
        //we can use this.name also because if we set name=name it will give an error
        // but setting this.name=name doesn't give error
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}

public class First_24 {
    public static void main(String[] args) {
        myEmployee aradhana= new myEmployee();
      //  aradhana.id=23;
      //  aradhana.name=--throws an error due to private access modifier
        aradhana.setName("Aradhana");
        System.out.println(aradhana.getName());
        aradhana.setId(98);
        System.out.println(aradhana.getId());
        aradhana.setClass_1("A");
        System.out.println(aradhana.getClass_1());
    }
}
