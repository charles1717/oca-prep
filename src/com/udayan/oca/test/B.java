package com.udayan.oca.test;

import com.udayan.oca.A;

public class B extends A {
    public void print() {
        A obj = new A();
        System.out.println(obj.i1);
//        System.out.println(obj.i2);
        System.out.println(this.i1);
        System.out.println(this.i2);
        System.out.println(super.i2);
        System.out.println(super.i1);
    }

    public static void main(String[] args){
        new B().print();
    }

}
