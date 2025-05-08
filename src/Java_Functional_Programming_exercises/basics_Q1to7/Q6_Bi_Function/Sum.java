package Java_Functional_Programming_exercises.basics_Q1to7.Q6_Bi_Function;

import java.util.function.BiFunction;

public class Sum
{
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction=(x,y)->x+y;

        System.out.println(biFunction.apply(5,4));
    }
}
