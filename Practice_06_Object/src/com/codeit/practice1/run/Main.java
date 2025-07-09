package com.codeit.practice1.run;

import com.codeit.practice1.model.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setpName("새우깡");
        product.setPrice(1000);
        product.setBrand("오리온");

        System.out.println(product);
    }
}
