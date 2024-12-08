package Day4;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation {

    // Class Variables
    private int wagePerHour;
    private int fullDayHour;
    private int partTimeHour;
    private int totalWorkingDays;
    private int maxHours;
    private int maxDays;

    // Constructor to initialize employee details
    public EmployeeWageComputation(int wagePerHour, int fullDayHour, int partTimeHour, int totalWorkingDays, int maxHours, int maxDays) {
        this.wagePerHour = wagePerHour;
        this.fullDayHour = fullDayHour;
        this.partTimeHour = partTimeHour;
        this.totalWorkingDays = totalWorkingDays;
        this.maxHours = maxHours;
        this.maxDays = maxDays;
    }

    // Method to compute and print employee wages
    public void computeEmployeeWage() {
        // Check employee attendance
        Random random = new Random();
        int attendance = random.nextInt(2); // 0 for absent, 1 for present

        if (attendance == 1) {
            System.out.println("Employee is Present");

            // Calculate daily employee wage
            int dailyWage = wagePerHour * fullDayHour;
            System.out.println("Daily Wage: " + dailyWage);

            // Calculate part-time employee wage
            int partTimeWage = wagePerHour * partTimeHour;
            System.out.println("Part-Time Wage: " + partTimeWage);

            // Calculate wages for a month
            int monthlyWage = dailyWage * totalWorkingDays;
            System.out.println("Monthly Wage: " + monthlyWage);

            // Calculate wages until a condition is met (max hours or max days)
            int totalHours = 0;
            int totalDays = 0;

            while (totalHours < maxHours && totalDays < maxDays) {
                totalHours += fullDayHour; // Assuming full-day work each time
                totalDays++;
            }

            int totalWages = totalDays * dailyWage;
            System.out.println("Total Wages till Condition Met: " + totalWages);
        } else {
            System.out.println("Employee is Absent");
        }
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input for wage per hour
        System.out.print("Enter wage per hour: ");
        int wagePerHour = scanner.nextInt();

        // Input for full day working hours
        System.out.print("Enter full day working hours: ");
        int fullDayHour = scanner.nextInt();

        // Input for part-time working hours
        System.out.print("Enter part-time working hours: ");
        int partTimeHour = scanner.nextInt();

        // Input for total working days in a month
        System.out.print("Enter total working days in a month: ");
        int totalWorkingDays = scanner.nextInt();

        // Input for maximum hours and maximum days
        System.out.print("Enter maximum hours of work: ");
        int maxHours = scanner.nextInt();
        System.out.print("Enter maximum days of work: ");
        int maxDays = scanner.nextInt();

        // Create an instance of EmployeeWageComputation
        EmployeeWageComputation employee = new EmployeeWageComputation(wagePerHour, fullDayHour, partTimeHour, totalWorkingDays, maxHours, maxDays);

        // Compute the employee wage
        employee.computeEmployeeWage();

        // Close the scanner
        scanner.close();
    }
}
