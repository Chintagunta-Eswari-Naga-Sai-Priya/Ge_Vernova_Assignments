package Day1;

import java.util.Scanner;

public class Day1_Assignment_Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Power of 2 Program!");
        System.out.print("Enter the power value N (0 <= N < 31): ");
        int N = scanner.nextInt();
        if (N < 0 || N >= 31) {
            System.out.println("Error: Please enter a value of N such that 0 <= N < 31.");
        } else {
            System.out.println("Powers of 2 up to 2^" + N + ":");
            for (int i = 0; i <= N; i++) {
                System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
            }
        }
        scanner.close();
    }
}
