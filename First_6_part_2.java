package com.company;
import java.math.BigDecimal;
import java.math.MathContext;

public class First_6_part_2 {
    public static void main(String[] args) {
        //big decimal
        double x=0.2;
        double y=0.3;
        System.out.println(x+y);//will give you a large value that's why double and float are not
        //considered to be a good choice for high level precision

        MathContext precision= new MathContext(3);
        BigDecimal val =new BigDecimal("1.0074256", precision);
        System.out.println(val);
        BigDecimal m= val.setScale(10);
        System.out.println(m);
        System.out.println("-----------");

        MathContext mathContext = new MathContext(5);
        BigDecimal a =new BigDecimal("3.145", mathContext);
        BigDecimal b= new BigDecimal("1.792", mathContext);
        BigDecimal sum=a.add(b,mathContext);
        BigDecimal sub=a.subtract(b,mathContext);
        BigDecimal product=a.multiply(b,mathContext);
        BigDecimal quotient=a.divide(b,mathContext);
        System.out.println("sum = "+sum);
        System.out.println("subtract = "+sub);
        System.out.println("product = "+product);
        System.out.println("quotient = "+quotient);

        MathContext precision1=new MathContext(3);
        BigDecimal bigDecimal=new BigDecimal("1.2495493",precision1);
        BigDecimal bigDecimal1=new BigDecimal("1.234",precision1);
        BigDecimal summation=bigDecimal.add(bigDecimal1,precision1);
        System.out.println(summation);

        MathContext precision_you_want=new MathContext(7);
        BigDecimal bigDecimal2=new BigDecimal("1.34457387",precision_you_want);
        BigDecimal bigDecimal3=new BigDecimal("1.344573",precision_you_want);
        BigDecimal final_output=bigDecimal2.add(bigDecimal3,precision_you_want);
        System.out.println(final_output);//2.68914687

    }
}
