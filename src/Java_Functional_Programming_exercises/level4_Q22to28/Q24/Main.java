package Java_Functional_Programming_exercises.level4_Q22to28.Q24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot", "mango");

        List<String> anslist = words.stream()
                .filter(word -> word.startsWith("a"))
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(anslist);

    }
}