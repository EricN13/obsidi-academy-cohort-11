package com.bptn.course._09_arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers to store numbers
        ArrayList<Integer> numberList = new ArrayList<Integer>();


        // Add elements to the ArrayList

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);

        System.out.println("ArrayList Elements:");

        // Access and print elements in the ArrayList using for-each loop
        for(int i=0;i<numberList.size();i++){
            System.out.println(numberList.get(i));
        }


        // Update an element at index 2 (third element) to 35
        numberList.set(2,35);
        // Remove an element at index 1 (second element, which is 20)
        numberList.remove(1);

        // Print the size of the ArrayList
        System.out.println("Size of ArrayList: " + numberList.size());
    }
}

