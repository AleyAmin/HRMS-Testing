package classes;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class PerformanceEvaluationTest {

    @Test
    void testEvaluatePerformance_NoPerformanceElements() {
        Employee employee = new Employee("Alice", 101, "alice", "password", null, "Sales", EmployeeType.Hourly,Evaluation.Excellent);
        Evaluation evaluation = PerformanceEvaluation.evaluatePerformance(employee);
        assertEquals(Evaluation.Unsatisfactory, evaluation);
    }

    @Test
    void testEvaluatePerformance_NeedsImprovement() {
        Employee employee = new Employee("Bob", 102, "bob", "password", null, "IT", EmployeeType.PartTime,Evaluation.Excellent);
        employee.addPerformance(Performanc.Productivity);
        employee.addPerformance(Performanc.Quality);

        Evaluation evaluation = PerformanceEvaluation.evaluatePerformance(employee);
        assertEquals(Evaluation.NeedsImprovement, evaluation);
    }

    @Test
    void testEvaluatePerformance_MeetsExpectations() {
        Employee employee = new Employee("Charlie", 103, "charlie", "password", null, "Marketing", EmployeeType.Intern,Evaluation.Excellent);
        employee.addPerformance(Performanc.Quality);
        employee.addPerformance(Performanc.Punctuality);
        employee.addPerformance(Performanc.Skills);

        Evaluation evaluation = PerformanceEvaluation.evaluatePerformance(employee);
        assertEquals(Evaluation.MeetsExpectations, evaluation);
    }
    @Test
    void testEvaluatePerformance_Excellent() {
        Employee employee = new Employee("Charlie", 103, "charlie", "password", null, "Marketing", EmployeeType.Intern,Evaluation.Excellent);
        employee.addPerformance(Performanc.Quality);
        employee.addPerformance(Performanc.Punctuality);
        employee.addPerformance(Performanc.Skills);
        employee.addPerformance(Performanc.Attendance);


        Evaluation evaluation = PerformanceEvaluation.evaluatePerformance(employee);
        assertEquals(Evaluation.Excellent, evaluation);
    }
    @Test
    void testEvaluatePerformance_OverAchieving() {
        Employee employee = new Employee("Charlie", 103, "charlie", "password", null, "Marketing", EmployeeType.Intern,Evaluation.Excellent);
        employee.addPerformance(Performanc.Quality);
        employee.addPerformance(Performanc.Punctuality);
        employee.addPerformance(Performanc.Skills);
        employee.addPerformance(Performanc.Attendance);
        employee.addPerformance(Performanc.Productivity);



        Evaluation evaluation = PerformanceEvaluation.evaluatePerformance(employee);
        assertEquals(Evaluation.OverAchieving, evaluation);
    }

}

