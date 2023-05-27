package com.company;
interface FuncInterface{
    void AbstractFunction(int A);
    default void GeneralFunction(){
        System.out.println("Welcome");
    }
}
public class First_65_lambda_expression_5 {
    public static void main(String[] args) {
        FuncInterface fobj=(int A)-> System.out.println(10+A);
        fobj.AbstractFunction(15);
    }
}
