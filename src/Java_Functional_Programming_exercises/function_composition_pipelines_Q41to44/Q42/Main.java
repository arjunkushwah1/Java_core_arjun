package Java_Functional_Programming_exercises.function_composition_pipelines_Q41to44.Q42;

import java.util.function.Function;

public class Main
{
    public static void main(String[] args) {
        Function<String, Integer> parse = Integer::parseInt;


        Function<Integer, Integer> doubleIt = x -> x * 2;

        // run both
        Function<String, Integer> parseAndDouble = parse.andThen(doubleIt);

        String input = "7";
        int result = parseAndDouble.apply(input);

        System.out.println("Input: " + input);
        System.out.println("Doubled Result: " + result);
    }
}
