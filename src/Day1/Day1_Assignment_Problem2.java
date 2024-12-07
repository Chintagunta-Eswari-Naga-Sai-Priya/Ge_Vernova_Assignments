package Day1;

import java.util.Scanner;

public class Day1_Assignment_Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit year: ");
        int year = scanner.nextInt();
        if (year < 1000 || year > 9999) {
            System.out.println("Error: Please enter a valid 4-digit year.");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
        scanner.close();
    }
}
