package collection_worksheet_2.hands_on_2_objective.model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
import java.util.*;

public class Course
{
    private String c_Id;
    private String c_name;
    private String inst_name;
    private int capcity;
    private int credits;


    private TreeSet<Student> enrolledStudents;
    private Queue<Student> waitlist;

    public Course(String c_Id, String c_name, String inst_name, int capcity, int credits) {
        this.c_Id = c_Id;
        this.c_name = c_name;
        this.inst_name = inst_name;
        this.capcity = capcity;
        this.credits = credits;
        this.enrolledStudents = new TreeSet<>(Comparator.comparing(Student::getS_name));
        this.waitlist = new LinkedList<>();
    }


    public String getC_Id() {
        return c_Id;
    }

    public String getC_name() {
        return c_name;
    }

    public String getInst_name() {
        return inst_name;
    }

    public int getCapcity() {
        return capcity;
    }

    public int getCredits() {
        return credits;
    }

    public TreeSet<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public Queue<Student> getWaitlist() {
        return waitlist;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course) {
            Course other = (Course) obj;
            return this.c_Id.equals(other.c_Id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return c_Id.hashCode();
    }

    public String toString() {
        return c_name + " (" + c_Id + ") - " + inst_name;
    }

}
