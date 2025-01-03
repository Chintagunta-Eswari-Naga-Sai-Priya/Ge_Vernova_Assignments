package Day8;

// src/MaxFinder.java
import java.util.Arrays;

public class MaxFinder<T extends Comparable<T>> {
    private T[] values;

    @SafeVarargs
    public MaxFinder(T... values) {
        this.values = values;
    }

    public T testMaximum() {
        return Arrays.stream(values).max(T::compareTo).orElse(null);
    }
}
