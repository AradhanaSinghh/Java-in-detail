package com.company;

import java.util.Scanner;

class Person{
    private String name;
    private String emailId;
    private String mobileNumber;
    Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return ("Name : "+ getName()+"\n"+ "Email : "+ getEmailId()+"\n" + "Mobile : "+ getMobileNumber());
    }
}

public class Main6 {
    public static void main(String[] args) {
        Person person=new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("Name:");
        String s=sc.nextLine();
        person.setName(s);
        System.out.println("Email:");
        String s1=sc.nextLine();
        person.setEmailId(s1);
        System.out.println("Mobile:");
        String s2=sc.nextLine();
        person.setMobileNumber(s2);
        System.out.println(person);
    }
}
