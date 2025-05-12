package Java_Functional_Programming_exercises.basics_Q1to7.Q2_length_of_string;

import java.util.Scanner;
import java.util.function.Function;

public class StringLength
{
    public static void main(String[] args) {
        Function<String , Integer> funLen=s->s.length();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string : ");

        String s=sc.nextLine();
        System.out.println("Length of String = "+funLen.apply(s));
    }
}
