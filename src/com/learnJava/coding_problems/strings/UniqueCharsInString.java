package com.learnJava.coding_problems.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueCharsInString {

    public static void main(String args[])
    {

        String str = "Ge Wks   For   Geeks";

        // Creating array and Storing the array
        // returned by toCharArray()
        char[] ch = str.toCharArray();

        // Printing array
        for (char c : ch) {
            if(!Character.isWhitespace(c)) {
                System.out.println(c);
            }
        }

        Set<Character> strSet = new HashSet<>(0);
        boolean found = false;

        System.out.println("===================");

        for(char c : ch){
            if(!Character.isWhitespace(c)) {
                System.out.println(c);
            }
            if(!Character.isWhitespace(c) && strSet.contains(c)){
                found = true;
                break;
            } else{
                strSet.add(c);
            }
        }
        if(found){
            System.out.println("Not Unique");
        }else {
            System.out.println("Unique");
        }

        System.out.println("===================");

        List<String> charList = new ArrayList<>(0);

        for(Character c : ch){
            if(Character.isWhitespace(c)) { // Character.isDigit(c) for checking number
                charList.add("20%");
            }else{
                charList.add(new String(c.toString()));
            }
        }

        for(String strList : charList){
            System.out.println(strList);
        }


    }
}
