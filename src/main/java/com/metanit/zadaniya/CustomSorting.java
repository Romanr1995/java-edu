package com.metanit.zadaniya;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class CustomSorting {

    public static void main(String[] args) {
        List<Money> complexNumbers = asList(
                new Money(12, 10), new Money(40, 50), new Money(10, 42)
        );
    }

    public Comparator<Money> createMoneyComparator() {
        //пиши здесь!
        return null;
    }

    static class Money {
        int dollar;
        int cents;

        public Money(int dollar, int cents) {
            this.dollar = dollar;
            this.cents = cents;

            if (this.cents > 99) {
                throw new RuntimeException("cents amount must be below 99");
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Money money = (Money) o;
            return dollar == money.dollar && cents == money.cents;
        }

        @Override
        public int hashCode() {
            return Objects.hash(dollar, cents);
        }
    }

    /**
     * Данный компоратор должен сортировать все слова начинающиеся на руские буквы раньше чем остальные символы,
     * остальные строки идут в естественном порядке
     *
     */
    public Comparator<String> customStringCmp() {
        return null;
    }
}
