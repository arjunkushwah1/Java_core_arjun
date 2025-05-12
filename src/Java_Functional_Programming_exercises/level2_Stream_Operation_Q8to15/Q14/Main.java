package Java_Functional_Programming_exercises.level2_Stream_Operation_Q8to15.Q14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(5,36,12,15,300);
        List<Integer> ans=
                l.stream()
                        .map(x->x*x)
                        .collect(Collectors.toUnmodifiableList());

        System.out.println("before operation on list: "+l);
        System.out.println("after Squaring on list  :"+ans);
    }
}
