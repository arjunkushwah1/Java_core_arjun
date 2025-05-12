package collection_worksheet_2.hands_on_2_objective.model;

public class Student
{
    private String s_id;
    private String s_name;
    private String s_email;
    private String s_year;
    private String s_branch;

    public Student(String s_id, String s_name, String s_email, String s_year, String s_branch)
    {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_email = s_email;
        this.s_year = s_year;
        this.s_branch = s_branch;
    }

    public String getS_id() {
        return s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public String getS_email() {
        return s_email;
    }

    public String getS_year() {
        return s_year;
    }

    public String getS_branch() {
        return s_branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id='" + s_id + '\'' +
                ", s_name='" + s_name + '\'' +
                ", s_email='" + s_email + '\'' +
                ", s_year='" + s_year + '\'' +
                ", s_branch='" + s_branch + '\'' +
                '}';
    }
}
