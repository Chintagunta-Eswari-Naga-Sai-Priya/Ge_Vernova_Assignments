package Day14;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static List<Integer> findPrimesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        List<Integer> primes = findPrimesInRange(0, 1000);
        System.out.println("Prime numbers between 0 and 1000:");
        System.out.println(primes);
    }
}
