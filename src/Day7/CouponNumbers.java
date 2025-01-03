package Day7;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of distinct coupon numbers (N): ");
        int N = scanner.nextInt();

        HashSet<Integer> coupons = new HashSet<>();
        Random random = new Random();
        int count = 0;

        while (coupons.size() < N) {
            int coupon = random.nextInt(N);
            coupons.add(coupon);
            count++;
        }

        System.out.println("Total random numbers generated to get all distinct coupons: " + count);
        scanner.close();
    }
}
