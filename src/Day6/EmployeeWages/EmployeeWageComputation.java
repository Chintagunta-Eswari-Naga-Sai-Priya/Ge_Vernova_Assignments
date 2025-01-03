package Day6.EmployeeWages;

import java.util.HashMap;

public class EmployeeWageComputation {
    private HashMap<String, Integer> companyWageMap = new HashMap<>();

    public void addCompany(String companyName, int wagePerHour, int fullDayHour, int maxWorkingDays, int maxWorkingHours) {
        int totalWage = computeEmployeeWage(companyName, wagePerHour, fullDayHour, maxWorkingDays, maxWorkingHours);
        companyWageMap.put(companyName, totalWage);
    }

    public int getTotalWageByCompany(String companyName) {
        return companyWageMap.getOrDefault(companyName, 0);
    }
}
