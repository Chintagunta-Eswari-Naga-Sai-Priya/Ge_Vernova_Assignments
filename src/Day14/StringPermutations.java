package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutations {

    // Recursive method to generate all permutations
    public static void permuteRecursive(String str, String out) {
        if (str.isEmpty()) {
            System.out.println(out);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permuteRecursive(newStr, out + str.charAt(i));
        }
    }

    // Iterative method to generate all permutations
    public static List<String> permuteIterative(String str) {
        List<String> permutations = new ArrayList<>();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        do {
            permutations.add(new String(chars));
        } while (nextPermutation(chars));
        return permutations;
    }

    // Helper method to generate next permutation
    private static boolean nextPermutation(char[] arr) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) i--;
        if (i <= 0) return false;

        int j = arr.length - 1;
        while (arr[j] <= arr[i - 1]) j--;
        char temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = arr.length - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Permutations using recursion:");
        permuteRecursive(input, "");

        List<String> permutationsIterative = permuteIterative(input);
        System.out.println("\nPermutations using iteration:");
        for (String perm : permutationsIterative) {
            System.out.println(perm);
        }
    }
}
