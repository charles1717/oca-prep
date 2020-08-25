package com.udayan.oca;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;

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

    public int solution(int[] A) {
        List<Integer> uniqueElements = new ArrayList<>();
        int result = 0;

        Arrays.sort(A);

        for(int a : A){
            if(uniqueElements.contains(a))
                continue;
            else{
                uniqueElements.add(a);
            }
        }

        uniqueElements.removeIf(x -> x <= 0);

        if(uniqueElements.isEmpty())
            return 1;

        for(int i = 1; i <= 100_000_000; i++){
            if(!uniqueElements.contains(i)){
                result = i;
                break;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
//        Test test = new Test();
//        System.out.println(test.solution(new int[]{-1, -2, -3, 1, 3, 6, 4, 1, 2, 0, 9, 5, 100}));

        try {
            boolean newFile = false;
            File file = new File("fileWrite1.txt");
            System.out.println(file.exists());
            newFile = file.createNewFile();
            System.out.println(newFile);
            System.out.println(file.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}