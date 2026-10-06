package com.bptn.course._05_oop.cafeCalculatorCustomMethod;

public class CafeCalculations {
    public static void main(String[] args) {

//        // --- Step 1: Calculate revenue for each item type using our custom method ---
        CafeOrder coffee1 = new CafeOrder(7.5, 100);
        CafeOrder pastry1 = new CafeOrder(13, 10);
//
//        // --- Step 2: Calculate the total daily revenue using another custom method ---
//        double totalDailyRevenue = calculateDailyTotalRevenue(coffeeRevenue, pastryRevenue);

//        // --- Step 3: Print out the results ---

//        System.out.println("Daily Coffee Revenue: $"+coffeeRevenue);
//        System.out.println("Daily Pastry Revenue: $"+pastryRevenue);
//        System.out.println("Total Daily Revenue: $"+totalDailyRevenue);
        double coffeeRevenue = coffee1.calculateItemRevenue();
        double pastryRevenue = pastry1.calculateItemRevenue();
        double totalDailyRevenue = coffeeRevenue + pastryRevenue;

        System.out.println("Daily Coffee Revenue: $"+coffeeRevenue);
        System.out.println("Daily Pastry Revenue: $"+pastryRevenue);
        System.out.println("Total Daily Revenue: $"+totalDailyRevenue);


    }
}
