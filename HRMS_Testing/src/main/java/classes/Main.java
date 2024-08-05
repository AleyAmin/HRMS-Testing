package classes;

public class Main {
    HRemployee hre = new HRemployee();

    public void init() {
        Address address1 = new Address("Zahraa ElMaadi", "Cairo", "00000", "Egypt");
        Address address2 = new Address("Nasr city", "Cairo", "00000", "Egypt");
        hre.createEmployee("Ziad", 101, "Zeze", "password", address2, "Computer Engineering", EmployeeType.Hourly);
        hre.createEmployee("Omar", 102, "Bolty", "123", address1, "Computer Engineering", EmployeeType.FullTime);
    }
}
