package Java_Functional_Programming_exercises.level2_Stream_Operation_Q8to15.Q10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringName
{
    public static void main(String[] args)
    {
        List<String> nameList= Arrays.asList("abcd","ram","hello","Arjun","rahul","India","pirates of the caribbean","Harry Potter");

        List<String> answer=nameList.stream()
                .map(s->s.toLowerCase())
                .filter(s->s.length()>=4)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(answer);
    }
}
