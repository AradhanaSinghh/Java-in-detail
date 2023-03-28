package com.company;

import java.util.*;
//HASHMAP-printed values will not be in order
/*

KEY      : VALUE
"Aradhana": 1
"Divya": 2
"Diksha": 3
"Diva", 4

 */
public class First_55_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> rollNumber=new HashMap<>();

        rollNumber.put("Aradhana", 1);
        rollNumber.put("Divya", 2);
        rollNumber.put("Diksha", 3);
        rollNumber.put("Diva", 4);
        System.out.println(rollNumber);
        System.out.println(rollNumber.get("Diksha"));
        System.out.println(rollNumber.containsKey("Divya"));
        System.out.println(rollNumber.containsValue(2));
        System.out.println(rollNumber.size());
       rollNumber.remove("Aradhana");
       rollNumber.remove(0);

       // rollNumber.clear();
        for(Map.Entry pairEntry: rollNumber.entrySet()){
            System.out.println(pairEntry.getKey() + " : " +pairEntry.getValue());
        }

    }
}
