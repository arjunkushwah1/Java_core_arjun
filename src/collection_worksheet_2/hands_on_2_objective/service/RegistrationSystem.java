package collection_worksheet_2.hands_on_2_objective.service;

import collection_worksheet_2.hands_on_2_objective.model.Course;
import collection_worksheet_2.hands_on_2_objective.model.Student;

import java.util.*;

public class RegistrationSystem
{
    HashMap<String, Student> st_map=new HashMap<>();
    HashMap<String, Course> c_map=new HashMap<>();

    public void addCourse(Course course)
    {
        if (!c_map.containsKey(course.getC_Id())) {
            c_map.put(course.getC_Id(), course);
            System.out.println("course added.");
        }
        else
        {
            System.out.println("course already present.");
        }
    }

    public void addStudent(Student student) {
        if (!st_map.containsKey(student.getS_id()))
        {
            st_map.put(student.getS_id(), student);
            System.out.println("student added.");
        }
        else
        {
            System.out.println("student already present.");
        }
    }
    public void register(String sid,String cid)
    {
        Student student = st_map.get(sid);
        Course course = c_map.get(cid);

        if (student == null || course == null) {
            System.out.println("Invalid student or course ID.");
            return;
        }
        if (course.getEnrolledStudents().contains(student)) {
            System.out.println("Student already enrolled.");
            return;
        }

        if (course.getWaitlist().contains(student)) {
            System.out.println("Student already waitlisted.");
            return;
        }

        if (course.getEnrolledStudents().size() < course.getCapcity()) {
            course.getEnrolledStudents().add(student);
            System.out.println("Student enrolled in course.");
        }
        else {
            course.getWaitlist().add(student);
            System.out.println("Course is full. Student added to waitlist.");
        }
    }
    public void drop(String studentId, String courseId) {
        Student student = st_map.get(studentId);
        Course course = c_map.get(courseId);

        if (student == null || course == null) {
            System.out.println("Invalid student or course ID.");
            return;
        }

        if (course.getEnrolledStudents().remove(student)) {
            System.out.println("Student dropped from course.");

            if (!course.getWaitlist().isEmpty()) {
                Student next = course.getWaitlist().poll();
                course.getEnrolledStudents().add(next);
                System.out.println("Student " + next.getS_name() + " promoted from waitlist.");
            }
        } else if (course.getWaitlist().remove(student)) {
            System.out.println("Student removed from waitlist.");
        } else {
            System.out.println("Student not found in course or waitlist.");
        }
    }

    public void listStudents(String courseId) {
        Course course = c_map.get(courseId);
        if (course != null) {
            for (Student s : course.getEnrolledStudents()) {
                System.out.println(s);
            }
        } else {
            System.out.println("Course not found.");
        }
    }

    public void listStudentsByBranch(String branch) {
        for (Course course : c_map.values()) {
            System.out.println("Course: " + course.getC_name());
            for (Student s : course.getEnrolledStudents()) {
                if (s.getS_branch().equals(branch)) {
                    System.out.println(s);
                }
            }
        }
    }

    public void listCoursesByEnrollment() {
        List<Course> courseList = new ArrayList<>(c_map.values());
        courseList.sort((a, b) -> b.getEnrolledStudents().size() - a.getEnrolledStudents().size());
        for (Course c : courseList) {
            System.out.println(c + " - Enrolled: " + c.getEnrolledStudents().size());
        }
    }

    public void listCoursesByInstructor(String instructor) {
        for (Course c : c_map.values()) {
            if (c.getInst_name().equalsIgnoreCase(instructor)) {
                System.out.println(c);
            }
        }
    }

    public void listCoursesByCredits(int credit) {
        for (Course c : c_map.values()) {
            if (c.getCredits() == credit) {
                System.out.println(c);
            }
        }
    }
    public void viewWaitlist(String courseId) {
        Course course = c_map.get(courseId);
        if (course != null) {
            Queue<Student> waitlist = course.getWaitlist();
            if (waitlist.isEmpty()) {
                System.out.println("Waitlist is empty.");
            } else {
                System.out.println("Waitlisted Students:");
                for (Student s : waitlist) {
                    System.out.println(s);
                }
            }
        } else {
            System.out.println("Course not found.");
        }
    }

}
