package com.company;
/*
Create an interface TV remote and use it to inherit another interface smart TVremote
Create a class TV which implements TV remote interface
 */
interface TvRemote{
    void open();
}
interface smartTvRemote extends TvRemote {
    void close();
}
class Tv implements TvRemote{
    public void open(){
        System.out.println("Stream the best with Mi");
    }
}
public class Program_44_4 {
    public static void main(String[] args) {
        Tv mi=new Tv();
        mi.open();
    }
}
