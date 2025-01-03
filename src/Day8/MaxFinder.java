package Day8;

// src/MaxFinder.java
public class MaxFinder {
    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
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
