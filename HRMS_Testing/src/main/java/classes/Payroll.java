package classes;

public class Payroll {
    private EmployeeType employeeType;
    private double baseSalary;
    private int hours;
    private double tax;
    private double deductions;
    private double bonus;

    public Payroll(EmployeeType employeeType, double baseSalary, int hours, double tax, double deductions, double bonus) {
        this.employeeType = employeeType;
        this.baseSalary = baseSalary;
        this.hours = hours;
        this.tax = tax;
        this.deductions = deductions;
        this.bonus = bonus;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculatePay() {

        if (employeeType == EmployeeType.Hourly) {
            return baseSalary * hours + bonus - tax - deductions;
        } else if (employeeType == EmployeeType.Intern) {
            return baseSalary;
        } else {
            return baseSalary + bonus - tax - deductions;
        }
    }
}
