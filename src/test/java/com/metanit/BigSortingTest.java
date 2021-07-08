package com.metanit;

import com.metanit.zadaniya.BigSorting;
import org.junit.jupiter.api.Test;

import static com.metanit.zadaniya.BigSorting.bubbleSort;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BigSortingTest {

    @Test
    void первыйСлучай() {

        List<String> input = asList("1", "2", "100", "12303479849857341718340192371",
                "3084193741082937", "3084193741082938", "111", "200");

        List<String> output = asList("1", "2", "100", "111", "200", "3084193741082937",
                "3084193741082938", "12303479849857341718340192371");

        assertEquals(output, BigSorting.bigSorting(input));
    }

    @Test
    void второйСлучай() {

        List<String> input = asList("31415926535897932384626433832795", "1", "3", "10", "3", "5");

        List<String> output = asList("1", "3", "3", "5", "10", "31415926535897932384626433832795");


        assertEquals(output, BigSorting.bigSorting(input));
    }


    @Test
    void testBubbleSort() {
        List<Integer> ints = asList(6, 5, 2, 3, 1, 4);
        bubbleSort(ints);

        assertEquals(
                asList(1, 2, 3, 4, 5, 6),
                ints
        );
    }

    @Test
    void testBubbleSortComparator() {
        List<Integer> ints = asList(6, 5, 2, 3, 1, 4);

        Comparator<Integer> reverse = (lhs, rhs) -> {
            if (lhs > rhs)
                return -1;
            else if (lhs < rhs)
                return 1;

            return 0;
        };

        bubbleSort(ints, reverse);

        assertEquals(
                asList(6,5,4,3,2,1),
                ints
        );
    }

    @Test
    void testBubbleSortComparator2() {
        List<Integer> ints = asList(6, 5, 2, 3, 1, 4);

        bubbleSort(ints, Comparator.reverseOrder());

        assertEquals(
                asList(6,5,4,3,2,1),
                ints
        );
    }
}
