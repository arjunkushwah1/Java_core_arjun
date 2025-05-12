package Java_Functional_Programming_exercises.level3_Q16to21.Q20;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        List<Integer> integerList = Arrays.asList(1, 202, 3, 4, 53, 6, 7, 8, 9, 103);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search in the list: ");
        int num1 = sc.nextInt();

        Optional<Integer> result = integerList.stream()
                .filter(n -> n == num1)
                .findAny();
        int value = result.orElse(-1);
        if(value!=-1)
        {
            System.out.println("number found : "+value);
        }
        else
        {
            System.out.println("number not found in list");
        }
    }
}
