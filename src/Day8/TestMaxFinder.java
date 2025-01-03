package Day8;

// src/TestMaxFinder.java
public class TestMaxFinder {
    public static void main(String[] args) {
        testIntegerMaximum();
    }

    public static void testIntegerMaximum() {
        System.out.println("Test Case 1.1: Max at 1st Position");
        System.out.println("Max: " + MaxFinder.testMaximum(5, 3, 2)); // Max at 1st position

        System.out.println("Test Case 1.2: Max at 2nd Position");
        System.out.println("Max: " + MaxFinder.testMaximum(3, 7, 2)); // Max at 2nd position

        System.out.println("Test Case 1.3: Max at 3rd Position");
        System.out.println("Max: " + MaxFinder.testMaximum(1, 4, 9)); // Max at 3rd position
    }
}
