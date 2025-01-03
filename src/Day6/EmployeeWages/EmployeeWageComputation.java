// EmployeeWageComputation.java
package Day6.EmployeeWages;

public class CompanyEmpWage {
    private String companyName;
    private int totalWage;

    public CompanyEmpWage(String companyName, int totalWage) {
        this.companyName = companyName;
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Company: " + companyName + ", Total Wage: " + totalWage;
    }
}

public class EmployeeWageComputation {
    public int computeEmployeeWage(String companyName, int wagePerHour, int fullDayHour, int maxWorkingDays, int maxWorkingHours) {
        int totalHours = 0, totalDays = 0;

        while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {
            totalHours += fullDayHour;
            totalDays++;
        }

        int totalWage = totalHours * wagePerHour;
        System.out.println(new CompanyEmpWage(companyName, totalWage));
        return totalWage;
    }
}
