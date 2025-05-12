package Java_Functional_Programming_exercises.level3_Q16to21.Q18;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<String> stringlist = Arrays.asList("stream", "flow", "java");

        String result = stringlist.stream()
                .collect(Collectors.joining(","));
        System.out.println("list of string : "+stringlist);
        System.out.println("converted single string: "+result);
    }
}
