package Java_Functional_Programming_exercises.collectors_summarization_Q45to47.Q46;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Employee> empls = Arrays.asList(
                new Employee("Alice", 2020, 50000),
                new Employee("Bob", 2020, 60000),
                new Employee("Charlie", 2021, 70000),
                new Employee("David", 2021, 65000),
                new Employee("Eve", 2022, 55000)
        );

        // Group by year and find employee with max salary in each year
        Map<Integer, Optional<Employee>> highestPaidByYear = empls.stream()
                .collect(Collectors.groupingBy(
                        e->e.getJoiningYear(),
                        Collectors.maxBy(Comparator.comparing(e->e.getSalary()))
                ));

        highestPaidByYear.forEach((year, empOpt) ->
                System.out.println(year + " → " + empOpt.orElse(null))
        );
    }
}
