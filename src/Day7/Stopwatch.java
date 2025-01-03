package Day7;
import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press Enter to start the stopwatch...");
        scanner.nextLine();  // Start the stopwatch

        long startTime = System.currentTimeMillis();
        System.out.print("Press Enter to stop the stopwatch...");
        scanner.nextLine();  // Stop the stopwatch

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.printf("Elapsed time: %.2f seconds%n", elapsedTime / 1000.0);
        scanner.close();
    }
}
