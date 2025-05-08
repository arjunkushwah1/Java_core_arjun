package Java_Functional_Programming_exercises.level5_Q29to30.Q29;

public class Main
{
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> sumthree = (a, b, c) -> a + b + c;
        int sum = sumthree.apply(10, 20, 30);
        System.out.println("sum = " + sum);
    }
}
