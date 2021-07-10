package com.metanit.zadaniya;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

import static java.util.Arrays.asList;

public class CustomSorting {

    public static void main(String[] args) {
        List<Money> complexNumbers = asList(
                new Money(12, 10), new Money(40, 50), new Money(10, 42)
        );

    }

    public static Comparator<Money> createMoneyComparator_() {
        Comparator<Money>  comp = (Money m1,Money m2) -> {
            if (m1.dollar != m2.dollar) {
                if (m1.dollar > m2.dollar) {
                    return 1;
                } else if (m1.dollar < m2.dollar) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (m1.dollar == m2.dollar) {
                if (m1.cents > m2.cents) {
                    return 1;
                } else if (m1.cents < m2.cents) {
                    return -1;
                } else {
                    return 0;
                }
            }
            return 0;
        };
        return comp;
    }

    public static Comparator<Money> createMoneyComparator() {
        return (lhs, rhs) -> {
            if (lhs.dollar == rhs.dollar) {
                return Integer.compare(lhs.cents, rhs.cents);
            }
            return Integer.compare(lhs.dollar, rhs.dollar);
        };
    }

    public static Comparator<Money> createMoneyComparatorV2() {
        return Comparator.comparing((Money m) -> m.dollar)
                .thenComparing((Money m) -> m.cents);
    }

    public static Comparator<Money> createMoneyComparatorV3() {
        return Comparator.comparing(Money::getDollar)
                .thenComparing(Money::getCents);
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

        public int getDollar() {
            return dollar;
        }

        public int getCents() {
            return cents;
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
//    public Comparator<String> customStringCmp() {
//        Comparator<String> comparator = (String s1,String s2) -> {
//            if (!((s1.charAt(0) >= 'A' && s1.charAt(0) <= 'Z') || (s1.charAt(0) >= 'a' && s1.charAt(0) <= 'z'))) {
//               return s1.compareTo(s2);
//            }
//        };
//        return null;
//    }
}
