package com.udayan.oca;

import java.io.*;

public class Write3 {
    public static void main(String[] args){
        byte[] in = new byte[50];
        int size = 0;

        FileOutputStream fos = null;
        FileInputStream fis = null;

        File file = new File("fileWrite3.txt");

        try
        {
            fos = new FileOutputStream(file);
            String s = "howdy\nfolks\n";
            fos.write(s.getBytes("UTF-8"));

            fos.flush();
            fos.close();

            fis = new FileInputStream(file);
            size = fis.read(in);

            System.out.print(size + " ");

            for(byte b : in){
                System.out.print((char)b);
            }
            fis.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
