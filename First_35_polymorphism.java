package com.company;
//using default
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Hi! sending you a private message");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4K....");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("The number is: "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{
    public void takeSnap(){
        System.out.println("taking picture");
    }
    public void recordVideo(){
        System.out.println("recording...");
    }
    //    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }

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
public class First_35_polymorphism {
    public static void main(String[] args) {
            MyCamera2 cam1 = new MySmartPhone2();//this is a smartphone but use it as a camera otherwise you will get an error
            //cam1.getNetworks();-->Not allowed
            cam1.takeSnap();
            cam1.record4kVideo();
            MySmartPhone2 s=new MySmartPhone2();
            s.recordVideo();
            s.callNumber(798);

        }
    }


