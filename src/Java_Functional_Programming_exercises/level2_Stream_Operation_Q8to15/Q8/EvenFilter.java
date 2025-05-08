package Java_Functional_Programming_exercises.level2_Stream_Operation_Q8to15.Q8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFilter
{
    public static void main(String[] args)
    {
        List<Integer> integerList=new ArrayList<>(Arrays.asList(1,2,3,4,5,56,8676,9889));
        //List<Integer> integerList2list2=Arrays.asList(1,2,3,4,5);
        //System.out.println(integerList.stream().filter(i->i%2==0));
        List<Integer>l=integerList.stream().filter(integer -> integer%2==0).collect(Collectors.toList());

        System.out.println("Even List: "+ l);
    }
}
