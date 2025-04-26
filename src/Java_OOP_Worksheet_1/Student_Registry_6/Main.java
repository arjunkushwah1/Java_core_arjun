package Java_OOP_Worksheet_1.Student_Registry_6;

public class Main
{
    public static void main(String[] args)
    {
        Student s4=new Student("arjun");
        Student s5=new Student("aa");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        // Display each student's details
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();

        // Display total number of students
        System.out.println("Total students: " + Student.getTotalStudent());
        //System.out.println(s1.getCoutnStudent());
    }
}
