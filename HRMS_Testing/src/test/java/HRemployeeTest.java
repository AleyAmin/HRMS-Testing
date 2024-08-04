import classes.*;

import java.util.Date;

public class HRemployeeTest {

    public static void main(String[] args) {
        // Create an HRemployee instance
        HRemployee hrEmployee = new HRemployee();

        // Create some sample employees
        Address address1 = new Address("123 Main St", "Cityville", "12345", "USA");
        Employee employee1 = hrEmployee.createEmployee("Alice", 101, "alice", "password", address1, "HR", EmployeeType.FullTime);

        Address address2 = new Address("456 Elm St", "Townsville", "67890", "USA");
        Employee employee2 = hrEmployee.createEmployee("Bob", 102, "bob", "password", address2, "IT", EmployeeType.PartTime);

        // Add employees to the managed list
        hrEmployee.addEmployee(employee1);
        hrEmployee.addEmployee(employee2);

        // Evaluate employee performance
        Evaluation aliceEvaluation = hrEmployee.evaluateEmployeePerformance(101);
        Evaluation bobEvaluation = hrEmployee.evaluateEmployeePerformance(102);

        System.out.println("Alice's evaluation: " + aliceEvaluation);
        System.out.println("Bob's evaluation: " + bobEvaluation);

        // Create some leave requests
        Date d1 = new Date(2000, 11, 21);
        Date d2 = new Date(2010, 1, 3);
        Date d3 = new Date(2001, 9, 4);
        Date d4 = new Date(2001, 12, 3);
        LeaveRequest leaveRequest1 = new LeaveRequest(1, employee1, LeaveType.SickLeave,d1,d2);
        LeaveRequest leaveRequest2 = new LeaveRequest(2, employee2, LeaveType.VacationLeave,d3,d4);

        // Add leave requests
        hrEmployee.getAllLeaveRequests().add(leaveRequest1);
        hrEmployee.getAllLeaveRequests().add(leaveRequest2);

        // Approve or reject leave requests
        hrEmployee.approveLeaveRequest(1);
        hrEmployee.rejectLeaveRequest(2);

        // Print updated leave request status
        System.out.println("Leave request 1 status: " + leaveRequest1.getLeaveStatus());
        System.out.println("Leave request 2 status: " + leaveRequest2.getLeaveStatus());
    }
}
