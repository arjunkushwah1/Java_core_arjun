package Java_Functional_Programming_exercises.level2_Stream_Operation_Q8to15.Q15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
       List<String> stringList = Arrays.asList("solar System", "milky way","Avengers");

       List<Integer> lengthofStrings=stringList.stream()
               .map(str->str.length())
               .collect(Collectors.toUnmodifiableList());

        System.out.println("list of String "+stringList);
        System.out.println("list of length of Strings"+lengthofStrings);
    }
}
