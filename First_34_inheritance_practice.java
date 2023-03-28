package com.company;
interface pasta{
    void ingredients();
    void recipe();
}
interface Rajma{
    void eat();
    void soup();
}
class food implements Rajma,pasta{
    public void ingredients(){
        System.out.println("boiled pasta, milk, cheese");
    }
    public void recipe(){
        System.out.println("mix and eat");
    }

    @Override
    public void eat() {
        System.out.println("eat and repeat");
    }

    @Override
    public void soup() {
        System.out.println("Soupy rajma");
    }
}
public class First_34_inheritance_practice {
    public static void main(String[] args) {
        food f=new food();
        f.eat();
        f.soup();
        f.ingredients();
        f.recipe();
    }
}
