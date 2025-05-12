package Java_Functional_Programming_exercises.data_processing_transformation_Q31to35.Q34;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Employee> empl = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("David", "Finance"),
                new Employee("Eve", "IT"),
                new Employee("Frank", "IT")
        );

        Map<String, Long> departmentCounts = empl.stream().collect(Collectors.groupingBy(
                emp -> emp.getDepartment(),
                        Collectors.counting()
                ));

        departmentCounts.forEach((dept, count) ->
                System.out.println(dept + ": " + count + " employees"));

    }
}
