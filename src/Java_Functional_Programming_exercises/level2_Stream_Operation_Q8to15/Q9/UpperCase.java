package Java_Functional_Programming_exercises.level2_Stream_Operation_Q8to15.Q9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase
{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("hello", "love ","coding"));

        List<String> answerlist =new ArrayList<>();
        answerlist=list.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(answerlist);
    }

}
