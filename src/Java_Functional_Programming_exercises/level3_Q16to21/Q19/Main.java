package Java_Functional_Programming_exercises.level3_Q16to21.Q19;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> integerList = Arrays.asList(1,202,3,4,53,6,7,8,9,103);

        Optional<Integer> num=integerList.stream().filter(x->x%5==0).findFirst();

        if (num.isPresent()) {
            System.out.println("first number in list which is divisible by 5 =  " + num.get());
        } else {
            System.out.println("No  number found which is divisible by 5");
        }
    }
}
