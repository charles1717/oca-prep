package com.udayan.oca;

public class WrapperClasses {
    public static void main(String[] args){
        Integer i1 = Integer.valueOf(1000);
        int i2 = 1000;

        if(i1==i2)
            System.out.println("Different Objects");
        if(i1.equals(i2))
            System.out.println("Meaningfully Equal");

        Integer i3 = Integer.valueOf(100);
        Short i4 = Short.valueOf((short)100);
        if(i3==100)
            System.out.println("The same objects");
        if(i3.equals(100))
            System.out.println("Meaningfully Equal");

        short s = 300;
        Short s1 = Short.valueOf(s);

    }
}
