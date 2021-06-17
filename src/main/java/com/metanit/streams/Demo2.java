package com.metanit.streams;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        readFile("D:\\java-test\\input.txt", StandardCharsets.UTF_8);

        System.out.println("-".repeat(80) + "\n");

        readFile("D:\\java-test\\input2.txt", Charset.forName("windows-1251"));
    }

    public static void readFile(String fileName, Charset charset) throws IOException {
        Reader reader = new FileReader(fileName, charset);

        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            sb.append((char) c);
        }

        System.out.println(sb.toString());
    }
}
