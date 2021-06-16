package com.metanit.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //java.lang.Exception vs java.lang.RuntimeException
        //      checked       vs           unchecked

        int[] arr = new int[4];

        try {
            arr[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound!");
        }


        FileReader reader = new FileReader("test.txt");

    }
}
