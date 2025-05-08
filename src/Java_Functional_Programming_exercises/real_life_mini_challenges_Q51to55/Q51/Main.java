package Java_Functional_Programming_exercises.real_life_mini_challenges_Q51to55.Q51;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        String paragraph = "This is a test. This test is only a test!";
        Map<String,Long>wordFrequency=Arrays.stream(paragraph.split("\\W+" ))
                .map(s->s.toLowerCase())
                .filter(word ->!word.isEmpty())
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));
        System.out.println(wordFrequency);
    }
}
