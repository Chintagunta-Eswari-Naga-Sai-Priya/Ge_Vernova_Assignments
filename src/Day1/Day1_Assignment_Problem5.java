package Day1;

import java.util.Scanner;
public class Day1_Assignment_Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int N = scanner.nextInt();
        System.out.println("Prime factors of " + N + " are:");
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }
        if (N > 1) {
            System.out.print(N);
        }
        scanner.close();
    }
}