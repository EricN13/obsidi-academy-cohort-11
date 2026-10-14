package com.bptn.course._09_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTool {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        //print first item
        while(it.hasNext()){
            System.out.println(it.next());
    }

        // for-each
        for(String item :cars){
            System.out.println(item);
        }
}
}
