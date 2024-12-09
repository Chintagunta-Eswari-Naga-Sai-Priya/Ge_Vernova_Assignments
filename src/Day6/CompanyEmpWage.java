package Day6;

public class CompanyEmpWage {
    private final String companyName;
    private final int wagePerHour;
    private final int fullDayHour;
    private final int maxWorkingDays;
    private final int maxWorkingHours;
    private int totalWages;

    public CompanyEmpWage(String companyName, int wagePerHour, int fullDayHour, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.fullDayHour = fullDayHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalWages = 0;
    }

    public void setTotalWages(int totalWages) {
        this.totalWages = totalWages;
    }

    @Override
    public String toString() {
        return "Company: " + companyName + ", Total Wages: " + totalWages;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getFullDayHour() {
        return fullDayHour;
    }

    public int getMaxWorkingDays() {
        return maxWorkingDays;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }
}
