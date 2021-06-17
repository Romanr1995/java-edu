package com.metanit.streams;

import java.io.*;

public class Demo1 {
    private static final String message = "Hello world!";

    public static void main(String[] args) throws IOException {
        OutputStream out = System.out;
        File javaTestDir = new File("D:\\java-test");

        File test = new File("D:\\java-test\\test.txt");

        FileOutputStream fos = new FileOutputStream("D:\\java-test\\test.txt");

        fos.write('a');
        fos.write('b');
        fos.write(123);

        FileInputStream fis = new FileInputStream("D:\\java-test\\input.txt");

        StringBuilder sb = new StringBuilder();

        int c;
        while((c = fis.read()) != -1) {
            sb.append((char) c);
        }

        System.out.println(sb.toString());


        System.out.println();
    }
}
