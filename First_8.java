package com.company;

public class First_8 {
    public static void main(String[] args){
            String name ="Aradhana";
            System.out.println(name);
            int value = name.length();
            System.out.println(value);
            String lstring = name.toLowerCase();
            System.out.println(lstring);

            String ustring = name.toUpperCase();
            System.out.println(ustring);

            String nonTrimmedString = "     Java     ";
            System.out.println(nonTrimmedString);

            String trimmedString = nonTrimmedString.trim();
            System.out.println(trimmedString);
            //Aradhana

            System.out.println(name.substring(1));
            System.out.println(name.substring(1,6));//will print unto n-1

            System.out.println(name.replace('r', 'p'));
            System.out.println(name.replace("r", "ier"));

            System.out.println(name.startsWith("Har"));
            System.out.println(name.endsWith("dd"));

            System.out.println(name.charAt(4));
            String modifiedName = "Harryrryrry";
            System.out.println(modifiedName.indexOf("rry"));
            System.out.println(modifiedName.indexOf("rry", 4));
            System.out.println(modifiedName.lastIndexOf("rry", 7));
        /*
        As we all know last index start traversing from last so, here harrrryy till 7 then last rry is in index 5
        */

            System.out.println(name.equals("aradhana"));
            System.out.println(name.equalsIgnoreCase("HarRY"));
            System.out.println("I am escape sequence\tdouble quote");
    }

}
