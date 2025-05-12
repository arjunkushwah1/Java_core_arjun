package Java_Functional_Programming_exercises.level4_Q22to28.Q27;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main
{
    public static void main(String[] args)
    {
        List<String> sl=Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
        double ans =sl.stream().collect(Collectors.averagingDouble(str->str.length()));
        System.out.println(ans);
    }
}