package com.company;

public class First_69_StringBuffer_3 {
    public static void main(String[] args) {
        String[] wordsArr= {"I", "AM", "THAT", "I AM"};
        StringBuilder sb=new StringBuilder();
        for (String word: wordsArr) {
            sb.append(word).append(" ");
        }
        String theRealMe= sb.toString();
        System.out.println("theRealMe= "+ theRealMe);
    }
}
