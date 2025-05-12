package Java_Functional_Programming_exercises.function_composition_pipelines_Q41to44.Q43;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main
{
    // Generic method
    public static <T, R> List<R> transform(List<T> inputList, Function<T, R> transformer) {
        return inputList.stream()
                .map(transformer)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");


        List<String> uppercased = transform(names, String::toUpperCase);

        System.out.println("Original: " + names);
        System.out.println("Transformed: " + uppercased);
    }
}
