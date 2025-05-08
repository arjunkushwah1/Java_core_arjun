package Java_Functional_Programming_exercises.function_composition_pipelines_Q41to44.Q44;

import java.util.function.Function;

public class Main
{
    public static void main(String[] args) {
        // Function to parse string to integer
        Function<String, Integer> parse = Integer::parseInt;

        // Function to square an integer
        Function<Integer, Integer> square = x -> x * x;

        // --- andThen: parse THEN square ---
        Function<String, Integer> parseThenSquare = parse.andThen(square);
        System.out.println(parseThenSquare.apply("5")); // Output: 25

        // --- compose: square THEN parse ---
        Function<String, Integer> squareThenParse = square.compose(parse);
        System.out.println(squareThenParse.apply("5")); // Output: 25
    }
}
