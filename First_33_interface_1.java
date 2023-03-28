package com.company;
//using default
interface MyCamera{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Hi! sending you a private message");
    }//it will not directly be accessed as it is private
    /*
    The reason we have default methods in interfaces is to allow the developers to add new methods
    to the interfaces without affecting the classes that implement these interfaces.
     */
    default void record4kVideo(){ // here public is by default and default is used for method
        greet();
        System.out.println("Recording in 4K....");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("The number is: "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
    public void takeSnap(){
        System.out.println("taking picture");
    }
    public void recordVideo(){
        System.out.println("recording...");
    }
        public void record4KVideo(){
       System.out.println("Taking snap and recoding in 4k");
   }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks: ");
        String[] networkList={"Aradhana","Satashi","shinchan","shaktiman"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to.. "+network);
    }
}
public class First_33_interface_1{
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        //ms.greet// Throws an error!
        String[] ar = ms.getNetworks();
            for (String item: ar) {
            System.out.println(item);
         }
    }
}
