package Java_Functional_Programming_exercises.level3_Q16to21.Q21;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Integer> integerList=Arrays.asList(1,2,3,4,5,5,1,9,8,8,7);
        Set<Integer> set=integerList.stream()
                .collect(Collectors.toSet());
        System.out.println("list: "+integerList);
        System.out.println("set: "+set);
    }
}
