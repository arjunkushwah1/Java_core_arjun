package Java_Functional_Programming_exercises.data_processing_transformation_Q31to35.Q33;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(2, 3, 4, 6),
                Arrays.asList(1, 4, 8, 10),
                Arrays.asList(11, 2, 10, 14)
        );
        List<Integer> s=listOfLists.stream()
                .flatMap(list->list.stream())// Flatten List<List<Integer>> to Stream<Integer>
                .filter(n->n%2==0)
                .distinct()
                .collect(Collectors.toUnmodifiableList());

        System.out.println("distinict even number : "+s);
    }
}

