package com.company;
class myEmployee1{
    private int id;
    private String name;
    public void setName(String n){
        //we can use this.name also
        name=n;
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

    public myEmployee1(){//name will be same as class name
      id=45;
      name="Your-name-here";// constructor automatically invokes
    }

    public myEmployee1(String myName,int myId){
        id=myId;
        name="Your" +myName+"here";
    }
}

public class First_25 {
    public static void main(String[] args) {
        myEmployee1 aradhana= new myEmployee1("Aradhana",12);
        //aradhana.id=23;
        //aradhana.name="Aradhana";
        //--throws an error due to private access modifier
      //aradhana.setName("Sara");//setName will make it accessible for others
        System.out.println(aradhana.getName());
//        aradhana.setId(98);
        System.out.println(aradhana.getId());

    }
}

