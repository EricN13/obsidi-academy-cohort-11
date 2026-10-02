package com.bptn.course.exercises;

public class SecondHighestElement {

    public static void main(String args[])
    {
        int[] array = {12, 35, 1, 10, 34, 1};
        int output = secondHighest(array);

        System.out.println(output);
    }

    public static int secondHighest(int[] array) {
        //the highest and second hight are stored here
        int highest = -1;
        int second = -1;
        // we go through every number of the array
        for(int i=0; i < array.length; i++) {
            //int temp = -1;
            // if we find a new highest, the hightest is updated
            // and we move the old highest to second
            if(array[i] > highest) {
                second=highest;
                highest = array[i];

                //temp = highest;
            }
            // check if it should become the second highst
            else if (array[i]>second && array[i]< highest) {
                second = array[i];
            }
        }
        return second;
    }

}
