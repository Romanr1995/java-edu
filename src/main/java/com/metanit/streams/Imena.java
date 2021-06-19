package com.metanit.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Imena {
    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new FileReader("D:\\java-test\\name_rus.txt", Charset.forName("windows-1251")));
        FileWriter writer1 = new FileWriter("D:\\java-test\\line.txt");

        try {
            String line;
            while ((line = br1.readLine()) != null) {
                writer1.append(line);
                writer1.append('\n');
            }
        } finally {
            writer1.close();
            br1.close();
        }
    }
}
