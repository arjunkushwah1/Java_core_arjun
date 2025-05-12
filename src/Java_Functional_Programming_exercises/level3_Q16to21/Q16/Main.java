package Java_Functional_Programming_exercises.level3_Q16to21.Q16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("solar System", "milky way","Avengers","sum","Arjun","mmm");
        Map<Character,List<String>> map=stringList.stream()
                        .collect(Collectors.groupingBy(s->s.charAt(0)));
//        System.out.println("list of String "+stringList);
//        System.out.println("list of length of Strings"+lengthofStrings);
        System.out.println(map);
    }
}
