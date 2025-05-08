package Java_Functional_Programming_exercises.basics_Q1to7.Q5_string_alphabetically;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("zz","Bhuban","makhan","Arjun", "yak","world");
        System.out.println("before sorting: "+ stringList);
        stringList.sort((s1,s2)->s1.compareToIgnoreCase(s2));
        System.out.println("after sorting "+stringList);
    }
}
