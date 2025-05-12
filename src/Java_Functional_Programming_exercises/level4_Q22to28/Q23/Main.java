package Java_Functional_Programming_exercises.level4_Q22to28.Q23;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<String> sl= Arrays.asList("sun","moon","solarsystem","google");
        Function<String,String>  up=str->str.toUpperCase();
        Function<String,String> addex=str->str+"!";

        Function<String , String> funboth=up.andThen(addex);

        List<String> anslist=sl.stream().map(funboth).collect(Collectors.toUnmodifiableList());
        System.out.println("before  : "+sl);
        System.out.println("After : "+anslist);
    }
}