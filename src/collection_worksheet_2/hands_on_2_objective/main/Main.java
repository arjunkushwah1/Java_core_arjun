package collection_worksheet_2.hands_on_2_objective.main;

import collection_worksheet_2.hands_on_2_objective.model.Course;
import collection_worksheet_2.hands_on_2_objective.model.Student;
import collection_worksheet_2.hands_on_2_objective.service.RegistrationSystem;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        RegistrationSystem rs = new RegistrationSystem();
        System.out.println("\n welcome....");

        /*

        // sample student  and  course  by using these code you can skip 1st 3 steps

        Student s1 = new Student("S101", "Alice", "alice@univ.edu", "2nd", "CSE");
        Student s2 = new Student("S102", "Bob", "bob@univ.edu", "1st", "ECE");
        Student s3 = new Student("S103", "Charlie", "charlie@univ.edu", "3rd", "ME");
        Student s4 = new Student("S104", "Daisy", "daisy@univ.edu", "2nd", "CSE");
        Student s5 = new Student("S105", "Evan", "evan@univ.edu", "4th", "EEE");
        rs.addStudent(s1);
        rs.addStudent(s2);
        rs.addStudent(s3);
        rs.addStudent(s4);
        rs.addStudent(s5);
        Course c1 = new Course("CSE101", "Data Structures", "Dr. Sharma", 2, 4);
        Course c2 = new Course("ECE202", "Digital Logic", "Prof. Menon", 3, 3);
        Course c3 = new Course("ME301", "Thermodynamics", "Dr. Rao", 1, 3);
        Course c4 = new Course("EEE404", "Power Systems", "Dr. Singh", 2, 4);
        rs.addCourse(c1);
        rs.addCourse(c2);
        rs.addCourse(c3);
        rs.addCourse(c4); */

        while (true) {
            System.out.println("\n--- university course registration system ---");
            System.out.println("1. add student");
            System.out.println("2. add course");
            System.out.println("3. register student");
            System.out.println("4. drop student");
            System.out.println("5. list students by course");
            System.out.println("6. list students by branch");
            System.out.println("7. list courses by enrollment");
            System.out.println("8. list courses by instructor");
            System.out.println("9. list courses by credits");
            System.out.println("10. view waitlist");
            System.out.println("11. exit");
            System.out.print("enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("ID: ");
                String id = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Year: ");
                String year = sc.nextLine();
                System.out.print("Branch: ");
                String branch = sc.nextLine();
                rs.addStudent(new Student(id, name, email, year, branch));
            } else if (ch == 2) {
                System.out.print("Course ID: ");
                String id = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Instructor: ");
                String instr = sc.nextLine();
                System.out.print("Capacity: ");
                int cap = sc.nextInt();
                System.out.print("Credits: ");
                int cr = sc.nextInt();
                sc.nextLine();
                rs.addCourse(new Course(id, name, instr, cap, cr));
            } else if (ch == 3) {
                System.out.print("Student ID: ");
                String sid = sc.nextLine();
                System.out.print("Course ID: ");
                String cid = sc.nextLine();
                rs.register(sid, cid);
            } else if (ch == 4) {
                System.out.print("Student ID: ");
                String sid = sc.nextLine();
                System.out.print("Course ID: ");
                String cid = sc.nextLine();
                rs.drop(sid, cid);
            } else if (ch == 5) {
                System.out.print("Course ID: ");
                String cid = sc.nextLine();
                rs.listStudents(cid);
            } else if (ch == 6) {
                System.out.print("Branch: ");
                String b = sc.nextLine();
                rs.listStudentsByBranch(b);
            } else if (ch == 7) {
                rs.listCoursesByEnrollment();
            } else if (ch == 8) {
                System.out.print("Instructor: ");
                String i = sc.nextLine();
                rs.listCoursesByInstructor(i);
            } else if (ch == 9) {
                System.out.print("Credits: ");
                int c = sc.nextInt();
                rs.listCoursesByCredits(c);
            }
            else if (ch == 10) {
                System.out.print("Course ID: ");
                String cid = sc.nextLine();
                rs.viewWaitlist(cid);
            }
            else if (ch == 11) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
