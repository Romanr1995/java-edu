package com.metanit.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

public class Imena {

    public static final int NAME_CNT = 1988;

    public static void main(String[] args) throws IOException {

        String[] list = new String[NAME_CNT];

        try(BufferedReader br1
                    = new BufferedReader(
                            new FileReader("D:\\java-test\\name_rus.txt", Charset.forName("windows-1251")))
        ) {
            for (int i = 0; i < list.length; i++) {
                list[i] = br1.readLine();
            }
        }

        Arrays.sort(list);

        try(FileWriter writer1 = new FileWriter("D:\\java-test\\line.txt")) {
            for (int i = list.length - 1; i >= 0; i--) {
                writer1.append(list[i]).append('\n');
            }
        }
    }
}
