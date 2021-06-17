package com.metanit.streams;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        openFileJava7();

        if (true) return;

        FileWriter writer = new FileWriter("D:\\java-test\\text.txt");

        try {
            //code
            for (int i = 0; i < 1000; i++) {
                writer.append("Hello,World");
            }
        }/*catch (IOException e) {
        }*/
        finally {
            writer.close();
        }
    }

    public static void openFileJava7() throws IOException {
        try(FileOutputStream fos = new FileOutputStream("D:\\java-test\\output.txt")) {
            fos.write(123);
        }
    }
}
