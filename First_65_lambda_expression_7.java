package com.company;
public class First_65_lambda_expression_7 {
    interface Operation1{
        int operation(int a,int b);
    }
    interface Operation2{
        void Message(String message);
    }
    private int operate(int P,int Q, First_65_lambda_expression_7.Operation1 Obj){
        return Obj.operation(P,Q);
    }
    public static void main(String[] args) {
        Operation1 Add=(int x,int y)-> x+y;
        Operation1 Mult=(int x,int y)-> x*y;
        First_65_lambda_expression_7 Tobj = new First_65_lambda_expression_7();
        System.out.println("Addition is "+Tobj.operate(600,700,Add));
        System.out.println("Multiplication is "+Tobj.operate(60,30,Mult));
        Operation2 Fobj= message-> System.out.println("Codetantra "+ message);
        Fobj.Message("Lets code");
    }
}
