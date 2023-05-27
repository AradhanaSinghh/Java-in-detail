package com.company;

public class First_69_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer("Aradhana");
      //  sbf.append("  Singh");
       // sbf.replace(0,8,"Maanvi");
        //sbf.insert(7,"cool");
        char[] c=new char[]{'s','t','r','i','n','g','b','u','f','f','e','r'};
        sbf.getChars(0,7,c,2);
        //sbf.getChars(0,9,c,2);--String out of index
        System.out.println(sbf);
        System.out.println(c);
    }
}
