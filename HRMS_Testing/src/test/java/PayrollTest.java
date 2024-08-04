import classes.Payroll;
import classes.EmployeeType;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class PayrollTest {
    private Payroll fullTimePayroll;
    private Payroll partTimePayroll;
    private Payroll hourlyPayroll;
    private Payroll internPayroll;

    @BeforeAll
    public static void Message() {
        System.out.println("Testing the Payroll Class");
    }

    @BeforeEach
    public void setUp() {
        fullTimePayroll = new Payroll(EmployeeType.FullTime, 5000, 0, 1000, 500, 200);
        partTimePayroll = new Payroll(EmployeeType.PartTime, 2500, 0, 500, 250, 100);
        hourlyPayroll = new Payroll(EmployeeType.Hourly, 20, 160, 300, 150, 50);
        internPayroll = new Payroll(EmployeeType.Intern, 1000, 0, 100, 50, 0); // passed tax and deductions to make sure the calculation is working
    }

    @Test
    @DisplayName("Test Full-Time Employee Pay Calculation")
    public void testFullTimePay() {
        double expectedPay = 5000 + 200 - 1000 - 500;
        assertEquals(expectedPay, fullTimePayroll.calculatePay());
    }

    @Test
    @DisplayName("Test Part-Time Employee Pay Calculation")
    public void testPartTimePay() {
        double expectedPay = 2500 + 100 - 500 - 250;
        assertEquals(expectedPay, partTimePayroll.calculatePay());
    }

    @Test
    @DisplayName("Test Hourly Employee Pay Calculation")
    public void testHourlyPay() {
        double expectedPay = 20 * 160 + 50 - 300 - 150;
        assertEquals(expectedPay, hourlyPayroll.calculatePay());
    }

    @Test
    @DisplayName("Test Intern Pay Calculation")
    public void testInternPay() {
        double expectedPay = 1000;
        assertEquals(expectedPay, internPayroll.calculatePay());
    }

    @Test
    @DisplayName("Test Set and Get Employee Type")
    public void testSetGetEmployeeType() {
        fullTimePayroll.setEmployeeType(EmployeeType.PartTime);
        assertEquals(EmployeeType.PartTime, fullTimePayroll.getEmployeeType());
    }

    @Test
    @DisplayName("Test Set and Get Base Salary")
    public void testSetGetBaseSalary() {
        fullTimePayroll.setBaseSalary(6000);
        assertEquals(6000, fullTimePayroll.getBaseSalary());
    }

    @Test
    @DisplayName("Test Set and Get Hours")
    public void testSetGetHours() {
        hourlyPayroll.setHours(120);
        assertEquals(120, hourlyPayroll.getHours());
    }

    @Test
    @DisplayName("Test Set and Get Tax")
    public void testSetGetTax() {
        internPayroll.setTax(200);
        assertEquals(200, internPayroll.getTax());
    }

    @Test
    @DisplayName("Test Set and Get Deductions")
    public void testSetGetDeductions() {
        partTimePayroll.setDeductions(300);
        assertEquals(300, partTimePayroll.getDeductions());
    }

    @Test
    @DisplayName("Test Set and Get Bonus")
    public void testSetGetBonus() {
        fullTimePayroll.setBonus(300);
        assertEquals(300, fullTimePayroll.getBonus());
    }
}