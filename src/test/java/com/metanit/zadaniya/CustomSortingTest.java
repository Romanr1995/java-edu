package com.metanit.zadaniya;

import com.metanit.zadaniya.CustomSorting.Money;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomSortingTest {

    @Test
    public void testMoneyCustomSort() {
        List<Money> moneyList = Arrays.asList(
                new Money(10, 12),
                new Money(22, 0),
                new Money(10, 13),
                new Money(10, 99),
                new Money(11, 0)
        );

        Comparator<Money> moneyComparator = CustomSorting.createMoneyComparator_();

        moneyList.sort(moneyComparator);

        assertEquals(
                Arrays.asList(
                        new Money(10, 12),
                        new Money(10, 13),
                        new Money(10, 99),
                        new Money(11, 0),
                        new Money(22, 0)
                ),
                moneyList
        );
    }

}