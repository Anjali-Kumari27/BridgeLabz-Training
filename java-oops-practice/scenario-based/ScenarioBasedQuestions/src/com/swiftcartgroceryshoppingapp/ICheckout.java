package com.swiftcartgroceryshoppingapp;

public interface ICheckout {
    void generateBill();
    void applyDiscount(double couponAmount);
}

