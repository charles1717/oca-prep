package com.udayan.oca;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

public class Test {
    public static void main(String[] args) {
//        Super s = new Sub();
//        try {
//            s.m1();
//        } catch (FileNotFoundException e) {
//            System.out.print("M");
//        } finally {
//            System.out.print("N");
//        }

//        double price = 90000;
//        String model;
//        if(price > 100000) {
//            model = "Tesla Model X";
//        } else if(price <= 100000) {
//            model = "Tesla Model S";
//        }
//        System.out.println(model);

        int[] arr = new int[]{1,2,4,5,6};
        short [] array = new short[]{100, 100};
    }
}