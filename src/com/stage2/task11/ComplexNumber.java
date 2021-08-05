package com.stage2.task11;

public class ComplexNumber {
    private int re;
    private int im;

    public ComplexNumber(int re, int im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return re == that.re && im == that.im;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(Integer.toString(re) + Integer.toString(im));
    }
}
