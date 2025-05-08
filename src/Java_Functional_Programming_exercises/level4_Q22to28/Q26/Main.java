package Java_Functional_Programming_exercises.level4_Q22to28.Q26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {

        List<String> sl=Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
        List<String> anslist=sl.stream().distinct().sorted().collect(Collectors.toUnmodifiableList());
        System.out.println(anslist);

    }
}