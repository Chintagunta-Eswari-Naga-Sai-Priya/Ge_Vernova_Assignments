package Day6;

import java.util.Random;

public class EmployeeWageComputation {
    public void computeEmployeeWage(CompanyEmpWage company) {
        System.out.println("Computing Employee Wage for Company: " + company);

        int totalHours = 0;
        int totalDays = 0;

        Random random = new Random();

        while (totalHours < company.getMaxWorkingHours() && totalDays < company.getMaxWorkingDays()) {
            int attendance = random.nextInt(2); // 0 for absent, 1 for present
            if (attendance == 1) {
                totalHours += company.getFullDayHour(); // Add full-day hours
                totalDays++;
            }
        }

        int totalWages = totalHours * company.getWagePerHour();
        company.setTotalWages(totalWages);
        System.out.println("Result: " + company);
        System.out.println();
    }
    private CompanyEmpWage[] companies;
    private int numberOfCompanies;

    public EmployeeWageComputation() {
        companies = new CompanyEmpWage[5]; // Max 5 companies
        numberOfCompanies = 0;
    }

    public void addCompany(CompanyEmpWage company) {
        companies[numberOfCompanies++] = company;
    }

    public static void main(String[] args) {
        EmployeeWageComputation empWageComputation = new EmployeeWageComputation();

        empWageComputation.addCompany(new CompanyEmpWage("Company A", 20, 8, 20, 100));
        empWageComputation.addCompany(new CompanyEmpWage("Company B", 25, 8, 22, 120));
        empWageComputation.addCompany(new CompanyEmpWage("Company C", 30, 6, 18, 90));

        for (int i = 0; i < empWageComputation.numberOfCompanies; i++) {
            empWageComputation.computeEmployeeWage(empWageComputation.companies[i]);
        }
    }



}
