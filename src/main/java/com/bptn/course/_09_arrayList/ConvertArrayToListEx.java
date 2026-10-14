package com.bptn.course._09_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToListEx {// Complete the functionality of the method below
    public static List<String> convertArrayToList(String[] inputArray) {

        // Create a new ArrayList of String.
        ArrayList<String> a= new ArrayList<>();

        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. Hint: Use add() method to add elements to ArrayList.
        for(String item : inputArray){
            a.add(item);
        }


        // return the new list with elements.
        return a;
    }


    // Do not modify the code below
    public static void main(String[] args) {

        String [] cars = {"Volvo","Honda","Ford"};

        List<String> arraylist = convertArrayToList(cars);

        System.out.println(arraylist);
    }
}
