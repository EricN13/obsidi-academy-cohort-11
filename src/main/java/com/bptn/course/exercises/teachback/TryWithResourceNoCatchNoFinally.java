package com.bptn.course.exercises.teachback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceNoCatchNoFinally {
    public static void main(String[] args)
            throws IOException {

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader("data.txt"))) {

            System.out.println(br.readLine());
        }
    }
}

