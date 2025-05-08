package Java_Functional_Programming_exercises.basics_Q1to7.Q3_uppercase;

import java.util.Scanner;
import java.util.function.Consumer;

public class UpperCase
{
    public static void main(String[] args) {
        Consumer<String> consumer=s -> System.out.println(s.toUpperCase());
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string : ");

        String str=sc.nextLine();
        consumer.accept(str);

    }
}
