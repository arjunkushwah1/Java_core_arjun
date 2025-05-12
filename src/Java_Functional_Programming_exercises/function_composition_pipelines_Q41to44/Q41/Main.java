package Java_Functional_Programming_exercises.function_composition_pipelines_Q41to44.Q41;

import java.util.function.Function;

public class Main
{
    public static void main(String[] args) {
       //1st step
        Function<String, String> trim = String::trim;
        Function<String, String> toLower = String::toLowerCase;
        Function<String, String> removePunctuation = s -> s.replaceAll("\\p{Punct}", "");

        //2nd
        Function<String, String> pipeline = trim.andThen(toLower).andThen(removePunctuation);
        //3rd
        String input = "  Hello, World!!!  ";
        String result = pipeline.apply(input);

        System.out.println("Input:  " + input);
        System.out.println("Output: " + result);
    }
}
