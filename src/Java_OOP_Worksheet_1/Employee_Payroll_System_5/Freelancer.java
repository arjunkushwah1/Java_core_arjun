package Java_OOP_Worksheet_1.Employee_Payroll_System_5;

public class Freelancer extends Employee
{

    private String name;
    private double hourlyRate;
    private int hoursWorked;

    // Constructor to initialize Freelancer details
    public Freelancer(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement the calculateSalary method for freelancer
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;  // Freelancer is paid by the hour
    }

    // Implement the getDetails method
    @Override
    public String getDetails() {
        return "Freelancer: " + name + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}
