package com.company;
interface myPc{
    void wallpaper();
    void widgets();
    void notes(String m);
    default void ShutDown(String s){
        System.out.println("shut down your computer!");
    }
}
class Mac{
    void WelcomePage(){
        System.out.println("Welcome to the Home Page!");
    }
}
class Windows extends Mac implements myPc{
    public void wallpaper(){
        System.out.println("The Wallpaper is set!");
    }
    public void widgets(){
        System.out.println("Your widgets are set..");
    }
    public void notes(String m){
        System.out.println("Notes Added.."+ m);
    }
}
public class Practice_2 {
    public static void main(String[] args) {
        Windows asus= new Windows();
        asus.WelcomePage();
        asus.wallpaper();
        asus.widgets();
        asus.notes("\n Sometime days are not just ordinary..");
        asus.ShutDown("shut");

    }
}
