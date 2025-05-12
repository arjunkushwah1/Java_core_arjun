package Java_Functional_Programming_exercises.level2_Stream_Operation_Q8to15.Q12;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("sun","moon","solar system","fun");
        System.out.println("complete list : "+stringList);

//        List<String> answerlist=stringList.stream().reduce();
        String s = stringList.stream().reduce("", (s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
        System.out.println("String: "+s+" length of it: "+s.length());
    }
}
