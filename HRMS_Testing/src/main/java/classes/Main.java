package classes;

public class Main {
    HRemployee hre = new HRemployee();

    public void init() {
        Payroll fullTimePayroll = new Payroll(EmployeeType.FullTime, 5000, 0, 1000, 500, 200);
        Payroll partTimePayroll = new Payroll(EmployeeType.PartTime, 2500, 0, 500, 250, 100);
        Address address1 = new Address("Zahraa ElMaadi", "Cairo", "00000", "Egypt");
        Address address2 = new Address("Nasr city", "Cairo", "00000", "Egypt");
        hre.createEmployee("Ziad", 101, "Zeze", "password", address2, "Computer Engineering", EmployeeType.PartTime);
        hre.createEmployee("Omar", 102, "Bolty", "123", address1, "Computer Engineering", EmployeeType.FullTime);

        hre.findEmployeeById(101).setPay(partTimePayroll);
        hre.findEmployeeById(102).setPay(fullTimePayroll);
    }
}
