package com.company;
class emp{
    int age;
    int salary;
    public void detailing(int age,int salary){
        this.age=age;
        this.salary=salary;
    }

    emp(){
        System.out.println("constructor without any parameter");
    }

    emp(int a,int s){
        this.age=a;
        this.salary=s;
    }

    emp(emp e){
        this.age=e.age;
        this.salary=e.salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
class Box {
    int width;
    int length;
    Box( ) {
        width = 5;
        length = 6;
    }
    void area( ) {
        int area = width * length;
    }
}

public class First_27_copy_of_constructor {
    public static void main(String[] args) {
        emp employee=new emp();
        emp employee1=new emp(24,50000);
        System.out.println(employee1.getAge());
        System.out.println(employee1.getSalary());
        emp employee2=new emp(employee1);
        System.out.println(employee1.getAge());
        System.out.println(employee1.getSalary());
        Box box=new Box();
        box.area();
    }
}
