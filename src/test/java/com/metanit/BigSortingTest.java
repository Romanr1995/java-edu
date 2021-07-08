package com.metanit;

import com.metanit.zadaniya.BigSorting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class BigSortingTest {

    @Test
    void первыйСлучай() {

        List<String> input= new ArrayList<>();
        input.add("1");
        input.add("2");
        input.add("100");
        input.add("12303479849857341718340192371");
        input.add("3084193741082937");
        input.add("3084193741082938");
        input.add("111");
        input.add("200");

        List<String> output= new ArrayList<>();
        output.add("1");
        output.add("2");
        output.add("111");
        output.add("200");
        output.add("3084193741082937");
        output.add("3084193741082938");
        output.add("12303479849857341718340192371");

        assertEquals(output, BigSorting.bigSorting(input));
    }

    @Test
    void второйСлучай() {

        List<String> input= new ArrayList<>();
        input.add("31415926535897932384626433832795");
        input.add("1");
        input.add("3");
        input.add("10");
        input.add("3");
        input.add("5");


        List<String> output= new ArrayList<>();
        output.add("1");
        output.add("3");
        output.add("3");
        output.add("5");
        output.add("10");
        output.add("31415926535897932384626433832795");


        assertEquals(output, BigSorting.bigSorting(input));
    }
}
