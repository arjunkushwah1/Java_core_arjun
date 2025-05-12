package Java_Functional_Programming_exercises.data_processing_transformation_Q31to35.Q35;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Employee> empl = Arrays.asList(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 70000),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "Finance", 75000),
                new Employee("Eve", "IT", 80000),
                new Employee("Frank", "IT", 72000)
        );

        Map<String, Double> map = empl.stream().collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.averagingDouble(e -> e.getSalary())));

        System.out.println(map);
    }
}
