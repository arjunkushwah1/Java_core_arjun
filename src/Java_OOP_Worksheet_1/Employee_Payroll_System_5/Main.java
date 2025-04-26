package Java_OOP_Worksheet_1.Employee_Payroll_System_5;

public class Main
{
    public static void main(String[] args)
    {
        // Create a FullTimeEmployee and Freelancer
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("John Doe", 5000);
        Freelancer freelancer = new Freelancer("Alice Smith", 50, 120);

        // Display employee details and salary calculation
        System.out.println(fullTimeEmp.getDetails());
        System.out.println("Salary: " + fullTimeEmp.calculateSalary());

        System.out.println("\n" + freelancer.getDetails());
        System.out.println("Salary: " + freelancer.calculateSalary());
    }
}
