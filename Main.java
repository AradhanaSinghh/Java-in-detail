package com.company;
class Student {
    int rollno;
    String name;
    float fee;
    Student(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display( ) {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

class A1 {
    A1( ){
        System.out.print("hello ");
    }
    A1(int x)        {
        this( );
        System.out.print(x);
    }
}


class Main{
    public static void main(String args[ ]) {
        Student s = new Student(1, "John", 5000f);
        s.display( );
        A1 a = new A1(10);
    }
}