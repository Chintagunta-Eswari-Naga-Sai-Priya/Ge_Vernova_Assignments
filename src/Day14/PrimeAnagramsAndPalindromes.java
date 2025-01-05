package Day14;
import java.util.ArrayList;
import java.util.List;

public class PrimeAnagramsAndPalindromes {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static List<Integer> findPrimeAnagramsAndPalindromes(int start, int end) {
        List<Integer> primePalindromes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                primePalindromes.add(i);
            }
        }
        return primePalindromes;
    }

    public static void main(String[] args) {
        List<Integer> primePalindromes = findPrimeAnagramsAndPalindromes(0, 1000);
        System.out.println("Prime Palindromes between 0 and 1000:");
        System.out.println(primePalindromes);
    }
}
