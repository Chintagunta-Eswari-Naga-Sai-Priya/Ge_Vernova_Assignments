package Day6.EmployeeWages;

public interface IEmployeeWage {
    void addCompany(String companyName, int wagePerHour, int fullDayHour, int maxWorkingDays, int maxWorkingHours);
    void computeAllEmployeeWages();
}
