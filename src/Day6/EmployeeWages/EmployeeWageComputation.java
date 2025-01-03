package Day6.EmployeeWages;

import java.util.ArrayList;

public class EmployeeWageComputation implements IEmployeeWage {
    private ArrayList<CompanyEmpWage> companyWageList = new ArrayList<>();

    @Override
    public void addCompany(String companyName, int wagePerHour, int fullDayHour, int maxWorkingDays, int maxWorkingHours) {
        int totalWage = computeEmployeeWage(companyName, wagePerHour, fullDayHour, maxWorkingDays, maxWorkingHours);
        companyWageList.add(new CompanyEmpWage(companyName, totalWage));
    }

    @Override
    public void computeAllEmployeeWages() {
        for (CompanyEmpWage company : companyWageList) {
            System.out.println(company);
        }
    }

    private int computeEmployeeWage(String companyName, int wagePerHour, int fullDayHour, int maxWorkingDays, int maxWorkingHours) {
        int totalWage = 0;
        int totalHours = 0;
        int days = 0;

        while (days < maxWorkingDays && totalHours < maxWorkingHours) {
            int hoursWorked = (int) (Math.random() * (fullDayHour + 1));
            totalHours += hoursWorked;
            totalWage += hoursWorked * wagePerHour;
            days++;
        }
        return totalWage;
    }

    public static void main(String[] args) {
        EmployeeWageComputation computation = new EmployeeWageComputation();
        computation.addCompany("CompanyA", 20, 8, 20, 100);
        computation.addCompany("CompanyB", 25, 8, 22, 120);

        computation.computeAllEmployeeWages();
    }
}
