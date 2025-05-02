package collection_worksheet_2.Q15_college_subject_allotment;
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollegeAllotments ca = new CollegeAllotments();

        while (true) {
            System.out.println("\n--- College Subject Allotment Menu ---");
            System.out.println("1. Add subject for student");
            System.out.println("2. View subjects of a student");
            System.out.println("3. View students by subject");
            System.out.println("4. Display all allotments");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            if (ch == 1) {
                System.out.print("Enter student name: ");
                String student = sc.nextLine();
                System.out.print("Enter subject name: ");
                String subject = sc.nextLine();
                ca.addSubject(student, subject);
            } else if (ch == 2) {
                System.out.print("Enter student name: ");
                String student = sc.nextLine();
                ca.viewSubjectsOfStudent(student);
            } else if (ch == 3) {
                System.out.print("Enter subject name: ");
                String subject = sc.nextLine();
                ca.viewStudentsBySubject(subject);
            } else if (ch == 4) {
                ca.displayAllAllotments();
            } else if (ch == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
