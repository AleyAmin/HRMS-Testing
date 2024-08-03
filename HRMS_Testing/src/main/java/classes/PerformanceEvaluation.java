package classes;

import java.util.List;

public class PerformanceEvaluation {
    // Define the mapping between performance elements and evaluations
    private static final int MIN_PERFORMANCE_FOR_MEETS = 3;
    private static final int MIN_PERFORMANCE_FOR_NEEDS_IMPROVEMENT = 2;

    public static Evaluation evaluatePerformance(Employee employee) {
        List<performance> performanceList = employee.getPerformanceList();
        int numPerformances = performanceList.size();

        if (numPerformances == MIN_PERFORMANCE_FOR_MEETS) {
            employee.setEvaluation(Evaluation.MeetsExpectations);
            return Evaluation.MeetsExpectations;
        } else if (numPerformances == MIN_PERFORMANCE_FOR_NEEDS_IMPROVEMENT) {
            employee.setEvaluation(Evaluation.NeedsImprovement);
            return Evaluation.NeedsImprovement;
        } else {
            employee.setEvaluation(Evaluation.Unsatisfactory);
            return Evaluation.Unsatisfactory;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        Address addressInstance = new Address("hhh","hhh","hhh","hhh");
        Employee employee1 = new Employee("John Doe", 123, "johndoe", "password", addressInstance, "HR", EmployeeType.FullTIme,Evaluation.Excellent);
        employee1.addPerformance(performance.Productivity);
        employee1.addPerformance(performance.Quality);
        employee1.addPerformance(performance.Attendance);

        evaluatePerformance(employee1);
        System.out.println("Employee 1 evaluation: " + employee1.getEvaluation());

        // Add more employees and their performance elements as needed...
    }
}
