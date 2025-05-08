package Java_Functional_Programming_exercises.level5_Q29to30.Q29;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}