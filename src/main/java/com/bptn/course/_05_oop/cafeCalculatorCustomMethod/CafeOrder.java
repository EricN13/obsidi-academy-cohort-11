package com.bptn.course._05_oop.cafeCalculatorCustomMethod;

public class CafeOrder {
    double pricePerItem;
    int numberOfItemsSold;

    CafeOrder( double pricePerItem,int numberOfItemsSold){
        this.numberOfItemsSold=numberOfItemsSold;
        this.pricePerItem=pricePerItem;
    }

    double calculateItemRevenue(){
        return pricePerItem * numberOfItemsSold;
    }

}

