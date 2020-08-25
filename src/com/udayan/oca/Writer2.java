package com.udayan.oca;

import java.io.*;

public class Writer2 {
    public static void main(String[] args){
        char[] in = new char[50];
        int size = 0;
        try
        {
            File file = new File("fileWrite2.txt");

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("howdy\nfolks\n");
            fileWriter.flush();
            fileWriter.close();

            FileReader fileReader = new FileReader(file);
            size = fileReader.read(in);
            System.out.print(size + " ");

            for(char c : in){
                System.out.print(c);
            }

            fileReader.close();
        }
        catch(IOException e) {}
    }
}
