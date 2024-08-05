import classes.Employee;
import classes.Address;
import classes.EmployeeType;
import classes.Performance;
import classes.Evaluation;
import classes.Payroll;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    private Employee employee;
    private Address address;
    private Evaluation evaluation;

    @BeforeAll
    public static void Message() {
        System.out.println("Testing the Employee Class");
    }

    @BeforeEach
    public void setUp() {
        address = new Address("Zahraa ElMaadi", "Cairo", "00000", "Egypt");
        evaluation = Evaluation.Excellent;
        employee = new Employee("John Doe", 1, "johndoe", "password123", address, "Engineering", EmployeeType.FullTime, evaluation);
    }

    @Test
    @DisplayName("Test Employee Initialization")
    public void testEmployeeInitialization() {
        assertEquals("John Doe", employee.getName());
        assertEquals(1, employee.getId());
        assertEquals("johndoe", employee.getUsername());
        assertEquals("password123", employee.getPassword());
        assertEquals(address, employee.getAddress());
        assertEquals("Engineering", employee.getDepartment());
        assertEquals(EmployeeType.FullTime, employee.getEmployeeType());
        assertEquals(evaluation, employee.getEvaluation());
        assertTrue(employee.getPerformanceList().isEmpty());
    }

    @Test
    @DisplayName("Test Set and Get Name")
    public void testSetGetName() {
        employee.setName("Jane Doe");
        assertEquals("Jane Doe", employee.getName());
    }

    @Test
    @DisplayName("Test Set and Get ID")
    public void testSetGetId() {
        employee.setId(2);
        assertEquals(2, employee.getId());
    }

    @Test
    @DisplayName("Test Set and Get Username")
    public void testSetGetUsername() {
        employee.setUsername("janedoe");
        assertEquals("janedoe", employee.getUsername());
    }

    @Test
    @DisplayName("Test Set and Get Password")
    public void testSetGetPassword() {
        employee.setPassword("newpassword123");
        assertEquals("newpassword123", employee.getPassword());
    }

    @Test
    @DisplayName("Test Set and Get Address")
    public void testSetGetAddress() {
        Address newAddress = new Address("456 Elm St", "Metropolis", "IL", "62960", "USA");
        employee.setAddress(newAddress);
        assertEquals(newAddress, employee.getAddress());
    }

    @Test
    @DisplayName("Test Set and Get Department")
    public void testSetGetDepartment() {
        employee.setDepartment("Marketing");
        assertEquals("Marketing", employee.getDepartment());
    }

    @Test
    @DisplayName("Test Set and Get Employee Type")
    public void testSetGetEmployeeType() {
        employee.setEmployeeType(EmployeeType.PartTime);
        assertEquals(EmployeeType.PartTime, employee.getEmployeeType());
    }

    @Test
    @DisplayName("Test Set and Get Payroll")
    public void testSetGetPayroll() {
        Payroll payroll = new Payroll(EmployeeType.FullTime, 5000, 0, 1000, 500, 200);
        employee.setPay(payroll);
        assertEquals(payroll, employee.getPay());
    }

    @Test
    @DisplayName("Test Add and Get Performance List")
    public void testAddGetPerformanceList() {
        Performance performance = new Performance("2024-01-01", 90, "Excellent work");
        employee.addPerformance(performance);
        List<Performance> performanceList = employee.getPerformanceList();
        assertEquals(1, performanceList.size());
        assertEquals(performance, performanceList.get(0));
    }

    @Test
    @DisplayName("Test Set and Get Evaluation")
    public void testSetGetEvaluation() {
        Evaluation newEvaluation = new Evaluation(90, "Outstanding performance");
        employee.setEvaluation(newEvaluation);
        assertEquals(newEvaluation, employee.getEvaluation());
    }
}
