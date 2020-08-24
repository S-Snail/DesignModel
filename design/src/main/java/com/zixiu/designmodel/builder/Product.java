package com.zixiu.designmodel.builder;

/**
 * Author: Snail
 * Time:  2020/8/20 4:19 PM
 * FileName:  Product
 * 简介：
 */
public class Product {
    private String mPartA;
    private String mPartB;
    private String mPartC;

    public String getContent() {
        return "mPartA = " + mPartA + "\tmPartB = " + mPartB + "\tmPartC = " + mPartC;
    }

    public static class Builder {
        private Product product;

        public Builder() {
            product = new Product();
        }

        public Builder addPartA(String partA) {
            product.mPartA = partA;
            return this;
        }

        public Builder addPartB(String partB) {
            product.mPartB = partB;
            return this;
        }

        public Builder addPartC(String partC) {
            product.mPartC = partC;
            return this;
        }

        public Product build() {
            return product;
        }
    }

}
