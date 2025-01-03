package Day8;

public class TestMaxFinder {
    public static void main(String[] args) {
        testIntegerMaximum();
        testFloatMaximum();
        testStringMaximum();
    }

    public static void testIntegerMaximum() {
        MaxFinder<Integer> integerMaxFinder = new MaxFinder<>(5, 3, 2, 7, 8);
        integerMaxFinder.printMax(); // Print maximum integer
    }

    public static void testFloatMaximum() {
        MaxFinder<Float> floatMaxFinder = new MaxFinder<>(5.5f, 3.3f, 2.2f, 7.7f);
        floatMaxFinder.printMax(); // Print maximum float
    }

    public static void testStringMaximum() {
        MaxFinder<String> stringMaxFinder = new MaxFinder<>("Apple", "Peach", "Banana", "Zebra");
        stringMaxFinder.printMax(); // Print maximum string
    }
}
