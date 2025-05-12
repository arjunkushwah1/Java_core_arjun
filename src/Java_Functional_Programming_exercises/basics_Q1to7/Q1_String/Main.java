    package Java_Functional_Programming_exercises.basics_Q1to7.Q1_String;

    import java.util.Scanner;
    import java.util.function.Predicate;

    public class Main {
        public static void main(String[] args) {
            System.out.println("Enter a String : ");
            Scanner sc =new Scanner(System.in);
            String ss=sc.nextLine();
            Predicate<String> start=s->s.toLowerCase().startsWith("a");
            System.out.println(start.test(ss));
        }
    }
