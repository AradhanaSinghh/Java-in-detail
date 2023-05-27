package com.company;
interface anons{
    public void a1();
    public void a2();
}
//class anon_p implements anons
public class First_65_anonymous_Class {
    public static void main(String[] args) {
        anons n=new anons() {
            @Override
            public void a1() {
                System.out.println("a1");
            }

            @Override
            public void a2() {
                System.out.println("a2");
            }
        };
        n.a1();
        n.a2();
    }
}
