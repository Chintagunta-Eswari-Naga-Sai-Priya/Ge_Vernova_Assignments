package Day1;

import java.util.Scanner;

public class Day1_Assignment_Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Coin Flip Program!");
        System.out.print("Enter the number of times to flip the coin: ");
        int flips = scanner.nextInt();
        if (flips <= 0) {
            System.out.println("Error: Please enter a positive integer.");
        } else {
            int heads = 0;
            int tails = 0;
            for (int i = 0; i < flips; i++) {
                double randomValue = Math.random();
                if (randomValue < 0.5) {
                    tails++;
                } else {
                    heads++;
                }
            }
            double headsPercentage = ((double) heads / flips) * 100;
            double tailsPercentage = ((double) tails / flips) * 100;
            System.out.println("Results:");
            System.out.printf("Heads: %d (%.2f%%)%n", heads, headsPercentage);
            System.out.printf("Tails: %d (%.2f%%)%n", tails, tailsPercentage);
        }
        scanner.close();
    }
}
