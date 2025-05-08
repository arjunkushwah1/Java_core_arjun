package Java_Functional_Programming_exercises.real_life_mini_challenges_Q51to55.Q52;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main
{

    public static <T> List<T> filterAndLog(List<T>inputList,Predicate<T> pcondition)
    {
        return inputList.stream()
                .filter(pcondition)
                .peek(item-> System.out.println("filterd item : "+item))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        Predicate<String> longerThan3=name->name.length()>3;

        List<String> filteredNames = filterAndLog(names, longerThan3);
        System.out.println("Final filtered list: " + filteredNames);
    }
}
