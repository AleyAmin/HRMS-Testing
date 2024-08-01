package classes;

public class Employee {
    private String name;
    private int id;
    private String username;
    private String password;
    private String department;
    private EmployeeType employeeType;
    private Payroll pay;
    private Address address;

    public Employee(String name, int id, String username, String password, Address address, String department, EmployeeType employeeType) {
        this.name = name;
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.department = department;
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Payroll getPay() {
        return pay;
    }

    public void setPay(Payroll pay) {
        this.pay = pay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
