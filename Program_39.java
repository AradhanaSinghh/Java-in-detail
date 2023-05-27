package com.company;
class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}
public class Program_39 {
    public static void main(String[] args) {
        /*
        problem-1
        Create a class Employee with the following properties and methods:
        Salary (property) (int)
        getSalary (method returning int)
         name (property) (String)
         getName (method returning String)
         setName (method changing name)
         */

        Employee1 s = new Employee1();
        s.salary = 23;
        s.name = "Rohan";
        s.setName("Aradhana");
        int salary = s.getSalary();
        System.out.println(salary);
        System.out.println(s.getName());

   }
}
