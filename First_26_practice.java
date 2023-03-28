package com.company;
class WildLife{
    public String x;
    public String getX(){
        return x;
    }

    public void setX(String x) {
        System.out.println("color: ");
        this.x = x;
    }
}

class Dog extends WildLife{
    public String y;

    public String getY() {
        return y;
    }

    public void setY(String y) {
        System.out.println("voice: ");
        this.y = y;
    }
}
public class First_26_practice {
    public static void main(String[] args) {
        WildLife ant= new WildLife();
        ant.setX("brown");
        System.out.println(ant.getX());

        Dog d= new Dog();
        d.setY("bark");
        System.out.println(d.getY());
        //System.out.println(d.getX());//if you print  this it will give you null because there is nothing to print for getx
        d.setX("white");
        System.out.println(d.getX());
    }
}
