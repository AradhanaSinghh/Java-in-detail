package  com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Hall{
   private String name;
   private Long contactNumber;
   private Double costPerDay;
   private String ownerName;
   private Date bookingDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
    Hall(){

    }
    Hall(String name, Long contactNumber, Double costPerDay,String ownerName, Date bookingDate){
        this.name=name;
        this.contactNumber=contactNumber;
        this.costPerDay=costPerDay;
        this.ownerName=ownerName;
        this.bookingDate=bookingDate;
    }
}
public  class Main1{
    public static void main(String[] args) throws ParseException {
        Hall hall=new Hall();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details of Hall 1");
        System.out.println("Name :");
        String a=sc.nextLine();
        hall.setName(a);
        System.out.println("Contact Number :");
        Long b=sc.nextLong();
        hall.setContactNumber(b);
        System.out.println("Cost Per Day :");
        Double c=sc.nextDouble();
        hall.setCostPerDay(c);
        sc.nextLine();
        System.out.println("Owner Name :");
        String d=sc.nextLine();
        hall.setOwnerName(d);
        System.out.println("Booking Date(dd/mm/yyyy) :");
        String e=sc.nextLine();
        DateFormat f1=new SimpleDateFormat("dd/MM/YYYY");
        Date date=f1.parse(e);
        System.out.println("Enter the details of Hall 2");
        System.out.println("Name :");
        String a1=sc.nextLine();
        hall.setName(a1);
        System.out.println("Contact Number :");
        Long b1=sc.nextLong();
        hall.setContactNumber(b1);
        System.out.println("Cost Per Day :");
        Double c1=sc.nextDouble();
        hall.setCostPerDay(c1);
        sc.nextLine();
        System.out.println("Owner Name :");
        String d1=sc.nextLine();
        hall.setOwnerName(d1);
        System.out.println("Booking Date(dd/mm/yyyy) :");
        String e1=sc.nextLine();
        DateFormat f2=new SimpleDateFormat("dd/MM/YYYY");
        Date date1=f2.parse(e1);
        Boolean flag=false;
        if(a.equals(a1) && b.equals(b1) && c.equals(c1) && d.equals(d1) && e.equals(e1)){
            flag=true;
        }
        else{
            flag=false;
        }
        if(flag==true){
            System.out.println("Halls are same");
        }
        else{
            System.out.println("Halls are different");
        }
    }
}