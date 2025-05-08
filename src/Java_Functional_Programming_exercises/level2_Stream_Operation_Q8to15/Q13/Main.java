package Java_Functional_Programming_exercises.level2_Stream_Operation_Q8to15.Q13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        List<Integer>l= Arrays.asList(1,23,4,3,54);
        List<Integer> ans=
                l.stream()
                .sorted((a,b)->b-a)
                .collect(Collectors.toUnmodifiableList());

        System.out.println("before sorting: "+l);
        System.out.println("after sorting :"+ans);
    }
}
