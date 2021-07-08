package com.metanit;

import com.metanit.zadaniya.BigSorting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigSortingTest {

    @Test
    void первыйСлучай() {

        List<String> input= Arrays.asList("1","2","100","12303479849857341718340192371",
                                        "3084193741082937","3084193741082938","111","200");

        List<String> output = Arrays.asList("1","2","111","200","3084193741082937",
                                    "3084193741082938","12303479849857341718340192371");

        assertEquals(output, BigSorting.bigSorting(input));
    }

    @Test
    void второйСлучай() {

        List<String> input= Arrays.asList("31415926535897932384626433832795","1","3","10","3","5");

        List<String> output= Arrays.asList("1","3","3","5","10","31415926535897932384626433832795");


        assertEquals(output, BigSorting.bigSorting(input));
    }
}
