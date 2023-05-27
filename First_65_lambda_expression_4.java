package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.*;

public class First_65_lambda_expression_4 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Ready","to","visit","Coders");
        Predicate<String> P=s->s.startsWith("C");
        for(String W:words){
            if(P.test(W)){
                System.out.println(W);
            }
        }
        Predicate<String> p= s->(s!=null&&s.length()>0);
        System.out.println("predicate= "+ p.test("okayJava"));
        Predicate<String> pMinLength= s->s.length()>4;
        System.out.println("predicate Min length= "+ pMinLength.test("okayJava"));
        Predicate<String> pMaxLength= s->s.length()<20;
        System.out.println("predicate Max length= "+ pMaxLength.test("okayJava"));

        System.out.println(p.and(pMinLength).test("Raj"));
        System.out.println(p.and(pMinLength).and(pMaxLength).test("OkayJavaOkay"));
        System.out.println(p.and(pMinLength).or(pMaxLength).test("OkayJavaOkay"));

        Function<String,Integer> f=(s)->s.length();
        System.out.println(f.apply("Okayjava"));
        Function<String,Boolean> fn=s->s!=null&&s.length()>0;
        System.out.println(fn.apply("Okayjava"));

        Consumer<String> consumer=str-> System.out.println(str);
        consumer.accept("OkayJava");

        Supplier supplier=()->new Date();
        System.out.println(supplier.get());

        UnaryOperator<Integer> cubeX=x->x*x*x;
        System.out.println(cubeX.apply(4));

        IntUnaryOperator intUnaryOperator=a->a+5;
        System.out.println(intUnaryOperator.applyAsInt(12));

        BinaryOperator<Integer> binaryOperator=(a,b)->a+b;
        System.out.println(binaryOperator.apply(12,10));

        IntBinaryOperator intBinaryOperator=(a,b)->a+b;
        System.out.println(intBinaryOperator.applyAsInt(10,12));


    }
}
