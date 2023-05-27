package com.company;

@FunctionalInterface
interface DemoAno{
    void meth1(int a);
   // void meth2();
}
/*class Func implements DemoAno{
    @Override
    public void meth1() {
        System.out.println("I am meth1");
    }
}*/

/*class Anonydemo implements  DemoAno{
    public void display(){
        System.out.println("Hello");
    }
    public void meth1(){
        System.out.println("I am meth1");
    }
    public void meth2(){
        System.out.println("I am meth2");
    }
}*/

public class First_65_lambdaExpression {
    public static void main(String[] args) {
        // DemoAno obj =new Anonydemo();
        //obj.meth1();
        /*DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("I am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth2");
            }
        };
        obj.meth1();*/

        //Lambda Expressions
        DemoAno obj=(a)->{System.out.println("I am method 1 from this lambda"+ a);
        };
        obj.meth1(6);
    }
}
