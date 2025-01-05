package Day14;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] words = {"banana", "apple", "grape", "orange"};
        insertionSort(words);

        System.out.println("Sorted List using Insertion Sort:");
        System.out.println(Arrays.toString(words));
    }
}
