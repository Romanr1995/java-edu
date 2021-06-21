package com.metanit.collect;

import java.util.ArrayList;

public class DemoCode1 {
    public static void main(String[] args) {
        double[] data = {1, 2.0, 12.11, Math.PI, 66};
        ArrayList<Double> doubles = new ArrayList<Double>();

        for (int i = 0; i < data.length; i++) {
            doubles.add(data[i]);
        }
        System.out.println(doubles);
    }
}
