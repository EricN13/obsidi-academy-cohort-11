package com.bptn.course._04_arrays;
    public class PerfectSquare {

        public static void main(String[] args) {
            System.out.println(isPerfectSquare(1));
            System.out.println(isPerfectSquare(4));
            System.out.println(isPerfectSquare(Integer.MAX_VALUE / 100));
            System.out.println(isPerfectSquare(255));
        }

        public static boolean isPerfectSquare ( int num){
            //check the number starting from 1
            //updated the operators
            for (int i = 1; i <= num; i++) {
                //Changed the if condition
                if (i * i == num) {
                    return true;
                }

            }
            return false;
        }


    }

