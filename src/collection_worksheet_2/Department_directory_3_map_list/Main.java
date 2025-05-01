package collection_worksheet_2.Department_directory_3_map_list;

public class Main
{
    public static void main(String[] args)
    {

        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(new Employee(1, "Alice", 80000, "HR"));
        directory.addEmployee(new Employee(2, "Bob", 95000, "IT"));
        directory.addEmployee(new Employee(3, "Charlie", 70000, "Sales"));
        directory.addEmployee(new Employee(4, "David", 92000, "IT"));
        directory.addEmployee(new Employee(5, "Eve", 88000, "HR"));
        directory.addEmployee(new Employee(6, "Frank", 67000, "Sales"));
        directory.addEmployee(new Employee(7, "Grace", 99000, "IT"));
        directory.addEmployee(new Employee(8, "Heidi", 73000, "Sales"));
        directory.addEmployee(new Employee(9, "Ivan", 87000, "HR"));


        directory.sortEmployeesBySalaryDesc();
        directory.topNEmployee(3);
    }
}
