package Java_OOP_Worksheet_1.Employee_Payroll_System_5;

public class FullTimeEmployee extends Employee
{
    public String name;
    public double salary;
    public FullTimeEmployee(String name, double salary)
    {
        this.name=name;
        this.salary=salary;
    }

    @Override
    public double  calculateSalary()
    {
        return salary;
    }

    @Override
    public String getDetails()
    {
        return "Full-time Employee: " + name + ", Salary: " + salary;
    }
}
