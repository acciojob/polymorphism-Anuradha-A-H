package com.driver;

public class Main {

    public static void main(String[] args){

        Product p = new Product();
        int ans = p.product(20,30);
        int ans2 = p.product(89,70,60);

        double ans3  = p.product(400,500,600);
    }


    static class  Product{

        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }
}