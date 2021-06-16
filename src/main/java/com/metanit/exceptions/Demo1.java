package com.metanit.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        try {
            FileReader reader = new FileReader("test.txt");
            System.out.println("file was opened successfully");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException has been occurred");
        }

        System.out.println("here");
    }
}
