package collection_worksheet_2.Q8_employee_hierarchy_system;

public class Main
{
    public static void main(String[] args)
    {
        EmployeeHierarchy system = new EmployeeHierarchy();

        //we are passing manager , level and  employee
        system.addEmployee("Alice", "Junior", new Employee(101, "John", "Junior"));
        system.addEmployee("Alice", "Senior", new Employee(102, "Jane", "Senior"));
        system.addEmployee("Alice", "Junior", new Employee(103, "Mike", "Junior"));
        system.addEmployee("Bob", "Mid", new Employee(201, "Emma", "Mid"));
        system.addEmployee("Bob", "Intern", new Employee(202, "Liam", "Intern"));
        system.displayHierarchy();

    }
}
