package Day6.EmployeeWages;

import java.util.ArrayList;

interface IEmployeeWage {
    void addCompany(String companyName, int wagePerHour, int fullDayHour, int maxWorkingDays, int maxWorkingHours);
    void computeAllEmployeeWages();
}

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
}
