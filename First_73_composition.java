package com.company;
class potpie{
    private int month;
    private int day;
    private int year;
    public potpie(int m,int d,int y){
        month=m;
        day=d;
        year=y;
        System.out.printf("The constructor for this is %s\n", this);
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month,day,year);
    }
}
class tuna{
    public String name;
    public potpie Birthday;
    tuna(String thename, potpie thedate){
        this.name=thename;
        this.Birthday=thedate;
    }

    @Override
    public String toString() {
        return String.format("the name is: %s and the day of birthday is %s ", name,Birthday);
    }
}
public class First_73_composition {
    public static void main(String[] args) {
       potpie potobj=new potpie(7,18,2);
       tuna tunaobj=new tuna("Aradhana",potobj);

        System.out.println(tunaobj);
    }
}
