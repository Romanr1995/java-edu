package com.metanit.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\java-test\\data.csv"));

        String line;
        while ((line = br.readLine()) != null ) {
            System.out.println(line);
            System.out.println("-".repeat(80));
        }
    }
}
