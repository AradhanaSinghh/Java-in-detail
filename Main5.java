package com.company;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

class ItemType {
    private String name;
    private Double deposit;
    private Double costPerDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }
    ItemType(){

    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s" , "Name" , "Deposit" , "CostPerDay" );
    }
}
public class Main5 {
    public static void main(String[] args) {
         ItemType itemType=new ItemType();
         Scanner sc=new Scanner(System.in);
         int i=1;
         Boolean flag=true;
         while(flag){
             System.out.println("Enter the details of Item Type "+i);
             System.out.println("Name:");
             String a=sc.nextLine();
             itemType.setName(a);
             System.out.println("Deposit:");
             Double a1=sc.nextDouble();
             itemType.setDeposit(a1);
             System.out.println("Cost per Day:");
             Double a2=sc.nextDouble();
             itemType.setCostPerDay(a2);
             System.out.println("Do you want to continue?(y/n)");
             String c=sc.nextLine();
            if(c.equals("y")){
                flag=true;
            }
            if(c.equals("n")){
                flag=false;
            }
            i++;
         }
         int count=0;

    }
}
