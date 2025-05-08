package Java_Functional_Programming_exercises.level4_Q22to28.Q25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        List<Person> people = Arrays.asList(
                new Person("Alice", 17),
                new Person("Bob", 20),
                new Person("Charlie", 25),
                new Person("David", 16),
                new Person("Eva", 19)
        );
        List<String> ansList=people.stream()
                        .filter(p->p.age>18)
                .map(p->p.name).collect(Collectors.toList());
        System.out.println(ansList);

    }
}