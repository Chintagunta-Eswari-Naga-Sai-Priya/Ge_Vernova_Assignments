// EmployeeWageComputation.java
package Day6.EmployeeWages;

import java.util.ArrayList;

public class EmployeeWageComputation {
    private ArrayList<CompanyEmpWage> companyWageList = new ArrayList<>();

    public void addCompany(String companyName, int wagePerHour, int fullDayHour, int maxWorkingDays, int maxWorkingHours) {
        int totalWage = computeEmployeeWage(companyName, wagePerHour, fullDayHour, maxWorkingDays, maxWorkingHours);
        companyWageList.add(new CompanyEmpWage(companyName, totalWage));
    }

    public void displayAllCompanyWages() {
        for (CompanyEmpWage company : companyWageList) {
            System.out.println(company);
        }
    }
}
