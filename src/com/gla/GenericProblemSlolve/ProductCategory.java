package com.gla.GenericProblemSlolve;

public class ProductCategory {}
class ProductGeneric<T extends ProductCategory> {
    double price;

    ProductGeneric(double price) {
        this.price = price;
    }
}

class Discount {
    public static <T extends ProductGeneric<?>> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
    }
}
