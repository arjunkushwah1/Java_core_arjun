package Java_Functional_Programming_exercises.data_processing_transformation_Q31to35.Q32;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 78),
                new Student("Charlie", 92),
                new Student("David", 67),
                new Student("Eva", 88)
        );
        List<String>ans=students.stream().filter(s->s.getGrade()>=80).map(s->s.getName()).sorted().collect(Collectors.toUnmodifiableList());
        System.out.println(ans);
    }
}
