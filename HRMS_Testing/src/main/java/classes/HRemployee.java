package classes;

import java.util.ArrayList;
import java.util.List;

public class HRemployee {
    private List<Employee> managedEmployees;
    private LeaveManagement leaveManagement;
    private PerformanceEvaluation evaluateEmployee;

    public HRemployee() {
        this.managedEmployees = new ArrayList<>();
        this.leaveManagement = new LeaveManagement();
        this.evaluateEmployee = new PerformanceEvaluation();
    }

    public void addEmployee(Employee employee) {
        managedEmployees.add(employee);
    }

    public boolean removeEmployee(int employeeId) {
        for (Employee employee : managedEmployees) {
            if (employee.getId() == employeeId) {
                managedEmployees.remove(employee);
                return true;
            }
        }
        return false;
    }

    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : managedEmployees) {
            if (employee.getId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getAllEmployees() {
        return managedEmployees;
    }

    public Employee createEmployee(String name, int id, String username, String password, Address address, String department, EmployeeType employeeType) {
        Employee newEmployee = new Employee(name, id, username, password, address, department, employeeType, Evaluation.Excellent);
        addEmployee(newEmployee);
        return newEmployee;
    }

    public boolean deleteEmployee(int employeeId) {
        return removeEmployee(employeeId);
    }

    public List<LeaveRequest> getAllLeaveRequests() {
        return leaveManagement.getAllLeaveRequests();
    }

    public void approveLeaveRequest(int requestId) {
        leaveManagement.approveLeaveRequest(requestId);
    }

    public void rejectLeaveRequest(int requestId) {
        leaveManagement.rejectLeaveRequest(requestId);
    }

    public Evaluation evaluateEmployeePerformance(int employeeId) {
        Employee employee1 = findEmployeeById(employeeId);
        if (employee1 == null) {
            return null; // Employee not found
        } else {
            return PerformanceEvaluation.evaluatePerformance(employee1);
        }
    }

}
