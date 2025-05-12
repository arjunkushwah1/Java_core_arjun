package Java_Functional_Programming_exercises.basics_Q1to7.Q4_random_number;

import java.util.function.Supplier;

public class RandomNumber
{
    public static void main(String[] args) {
        Supplier<Double> doubleSupplier = ()->{return Math.random()*100;};
        System.out.println(doubleSupplier.get());
    }
}
