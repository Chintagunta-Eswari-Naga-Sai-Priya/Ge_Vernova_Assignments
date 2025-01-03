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
