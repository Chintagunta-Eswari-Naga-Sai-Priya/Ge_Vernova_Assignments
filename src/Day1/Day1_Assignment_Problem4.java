package Day1;

import java.util.Scanner;
public class Day1_Assignment_Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N (N > 0): ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("Error: Please enter a positive integer greater than 0.");
        } else {
            double harmonic = 0.0;
            for (int i = 1; i <= N; i++) {
                harmonic += 1.0 / i;
            }
            System.out.println("The " + N + "th harmonic value is: " + harmonic);
        }
        scanner.close();
    }
}
