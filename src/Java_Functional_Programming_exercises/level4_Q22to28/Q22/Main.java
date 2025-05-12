package Java_Functional_Programming_exercises.level4_Q22to28.Q22;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<String> sl= Arrays.asList("sun","moon","solarsystem","google");

        Map<String,Integer>map=sl.stream()
            .collect(Collectors.toMap(word -> word, word -> word.length()));

        System.out.println(map);

    }
}
