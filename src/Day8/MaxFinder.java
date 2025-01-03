package Day8;

// src/MaxFinder.java
public class MaxFinder<T extends Comparable<T>> {
    private T a, b, c;

    public MaxFinder(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T testMaximum() {
        T max = a; // Assume a is the largest
        if (b.compareTo(max) > 0) {
            max = b; // b is larger
        }
        if (c.compareTo(max) > 0) {
            max = c; // c is larger
        }
        return max;
    }
}
