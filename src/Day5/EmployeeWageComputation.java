package Day5;

import java.util.Random;

public class EmployeeWageComputation {

    // Method to compute and display employee wage for a company
    public void computeEmployeeWage(String companyName, int wagePerHour, int fullDayHour, int maxWorkingDays, int maxWorkingHours) {
        System.out.println("Computing Employee Wage for Company: " + companyName);

        // Initialize variables
        int totalHours = 0;
        int totalDays = 0;
        int totalWages = 0;

        Random random = new Random();

        // Compute wages until max working days or max working hours is reached
        while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {
            int attendance = random.nextInt(2); // 0 for absent, 1 for present
            if (attendance == 1) {
                totalHours += fullDayHour; // Add full-day hours
                totalDays++;
            }
        }

        // Calculate total wages
        totalWages = totalHours * wagePerHour;
        System.out.println("Total Days Worked: " + totalDays);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Total Wages for " + companyName + ": " + totalWages);
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();

        // Compute wages for multiple companies
        employeeWageComputation.computeEmployeeWage("Company A", 20, 8, 20, 100);
        employeeWageComputation.computeEmployeeWage("Company B", 25, 8, 22, 120);
        employeeWageComputation.computeEmployeeWage("Company C", 30, 6, 18, 90);
    }
}
