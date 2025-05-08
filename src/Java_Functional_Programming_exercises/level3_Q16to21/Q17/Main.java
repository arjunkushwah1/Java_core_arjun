package Java_Functional_Programming_exercises.level3_Q16to21.Q17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> map=integerList.stream()
                .collect(Collectors.partitioningBy(x->x%2==0));


        Map<String, List<Integer>> result = new HashMap<>();
        result.put("even", map.get(true));
        result.put("odd", map.get(false));

        System.out.println(result);

        //System.out.println(map);
    }
}
