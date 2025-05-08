package Java_Functional_Programming_exercises.level4_Q22to28.Q28;

import java.util.Arrays;
import java.util.List;


public class Main
{
    public static void main(String[] args)
    {
        List<Integer> numl = Arrays.asList(2, 3, 4, 5, 6);

        int mul = numl.stream()
                .filter(n -> n % 2 == 0)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product of even numbers: " + mul);
    }
}