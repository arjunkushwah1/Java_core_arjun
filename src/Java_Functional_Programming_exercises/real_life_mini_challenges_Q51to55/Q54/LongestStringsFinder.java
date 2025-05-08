package Java_Functional_Programming_exercises.real_life_mini_challenges_Q51to55.Q54;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestStringsFinder
{
    public static List<String> getTop3LongestStrings(List<String> input) {
        return input.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "elephant", "dog", "hippopotamus", "cat", "rhinoceros", "ant"
        );

        List<String> top3 = getTop3LongestStrings(words);
        System.out.println("Top 3 longest strings: " + top3);
    }
}
