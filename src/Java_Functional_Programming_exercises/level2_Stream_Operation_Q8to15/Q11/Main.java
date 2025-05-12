package Java_Functional_Programming_exercises.level2_Stream_Operation_Q8to15.Q11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<String> stringList= Arrays.asList("sun","moon","solar system","fun");
        System.out.println("complete list : "+stringList);

        List<String> answerlist=stringList.stream().filter(s->s.startsWith("s")).collect(Collectors.toUnmodifiableList());
        System.out.println(answerlist);
    }
}
