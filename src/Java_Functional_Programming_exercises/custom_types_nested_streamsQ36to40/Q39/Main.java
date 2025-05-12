package Java_Functional_Programming_exercises.custom_types_nested_streamsQ36to40.Q39;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    // Helper method to determine age group
    private static String ageGroup(int age) {
        if (age < 20) return "<20";
        else if (age <= 40) return "20-40";
        else return "40+";
    }

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", 18),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("David", 42),
                new Person("Eve", 16),
                new Person("Frank", 50)
        );
        Map<String, List<Person>> groupedByAge = people.stream()
                .collect(Collectors.groupingBy(person -> ageGroup(person.getAge())));

        groupedByAge.forEach((group, list) -> {
            System.out.println(group + " → " + list);
        });
    }
}
