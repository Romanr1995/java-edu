package com.metanit.generics;

public class NumberHolder<T extends Number>{
    private T number;

    public NumberHolder(T number) {
        this.number = number;
    }

    public boolean isLessThan(NumberHolder<? extends Number> other) {
        return this.number.doubleValue() < other.number.doubleValue();
    }

    public boolean isLessThan_(NumberHolder<T> other) {
        return this.number.doubleValue() < other.number.doubleValue();
    }
}
