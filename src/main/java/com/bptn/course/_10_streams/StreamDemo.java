package com.bptn.course._10_streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main (String[] argS){
        List<Integer> myList= Arrays.asList(20,28,2,5,8,20,3,1,3);
        // filter elements greater than 20
        List<Integer> filtered=myList.stream()
                .filter(n->n>20)
                .toList();
        System.out.println(filtered);
    }

    // double each number    .map(n->n*2)
    // remove duplicate      .distinct()
    // reverse the list      . sorted(Comparator.reverseOrder())
    //total number            reduce(0, Integer::sum)

}
