package com.metanit.collect.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DemoCode1Test {

    @Test
    public void долженРазделитьПоКоличетвуБукв() {
        Set<String> str = new HashSet<>();

        str.add("frgr");
        str.add("w");
        str.add("uy");
        str.add("r");
        str.add("hfd");
        str.add("dkl");
        str.add("");

        Map<Integer, String > words = new HashMap<>();

        words.put(0,"");
        words.put(1," r, w");
        words.put(2," uy");
        words.put(3," dkl, hfd");
        words.put(4," frgr");




    }
}
