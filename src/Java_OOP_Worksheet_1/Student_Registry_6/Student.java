package Java_OOP_Worksheet_1.Student_Registry_6;

public class Student
{
    private static int countStudent=0;

    private String name;
    private int id;

    public Student(String name)
    {
        countStudent++;
        this.name=name;
        this.id=countStudent;
    }

    public static  int getTotalStudent()
    {
        return countStudent;
    }
    public void showDetails()
    {
        System.out.println("id : "+id+" name : "+name);
    }
}
