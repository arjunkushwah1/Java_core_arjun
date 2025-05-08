package Java_Functional_Programming_exercises.collectors_summarization_Q45to47.Q46;

public class Employee
{
    private String name;
    private int joiningYear;
    private double salary;

    public Employee(String name, int joiningYear, double salary) {
        this.name = name;
        this.joiningYear = joiningYear;
        this.salary = salary;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}
