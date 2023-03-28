package com.company;
class Employee {
    int salary;
    int id;
    String name;

    public void displayDetails() {
        System.out.println("id: "+id);
        System.out.println("name: "+name);
    }

    public int getSalary(){
        return salary;
    }
}

public class First_23{
    public static void main(String[] args){
        Employee aradhana= new Employee();
        Employee hanna= new Employee();
        aradhana.id=12;
        aradhana.salary=13;
        aradhana.name="Aradhana";
        hanna.id=13;
        hanna.salary=12;
        hanna.name="hanna";

      //System.out.println("id: " +aradhana.id+ " name: " +aradhana.name);
       //System.out.println("id: " +hanna.id+ " name: " +hanna.name);
        aradhana.displayDetails();
        hanna.displayDetails();
        int salary= hanna.getSalary();
        System.out.println(salary);
        /*
        we created a static method, which means that it can be accessed without creating an object of the class,
         unlike public, which can only be accessed by objects:
         */
    }
}
