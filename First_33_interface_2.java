package com.company;
interface Menu{
    void addToCart();
    void buy();
    String[] wishlist_items();
}
class Shopping{
    void delivery(){
        System.out.println("Your item has been delivered");
    }

}
class MyApp extends Shopping implements Menu{
    public String[] wishlist_items(){
        String[] wishlist={"ghagra","top","kurta set","jeans"};
        return wishlist;
    }
    public void addToCart(){
        System.out.println("Your item are added to the cart!");
    }
    public void buy(){
        System.out.println("Pick the address..");
    }
}
public class First_33_interface_2 {
    public static void main(String[] args) {
        MyApp oneSecCart=new MyApp();
        oneSecCart.addToCart();
        oneSecCart.buy();
        String[] ar=oneSecCart.wishlist_items();
            for(String item: ar){
                System.out.println(item);
            }
    }
}
