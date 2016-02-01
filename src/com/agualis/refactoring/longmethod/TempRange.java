package com.agualis.refactoring.longmethod;

public class TempRange {
    private final int min;
    private final int max;

    public TempRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getLow() {
        return min;
    }

    public int getHigh() {
        return max;
    }
}
