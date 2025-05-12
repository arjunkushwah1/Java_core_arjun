package Java_Functional_Programming_exercises.custom_types_nested_streamsQ36to40.Q40;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) throws NumberFormatException{
        String csv = "1,2,3,4";

        System.out.println("String : "+csv);
        List<Integer> numbers = Arrays.stream(csv.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Integer list : "+numbers);

    }
}
