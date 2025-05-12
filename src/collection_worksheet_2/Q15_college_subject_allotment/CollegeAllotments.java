package collection_worksheet_2.Q15_college_subject_allotment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class CollegeAllotments
{
    Map<String, List<String>> sttosub=new HashMap<>();

    public void addSubject(String student, String subject) {
        // Check if student is already in the map
        if (sttosub.containsKey(student) == false) {
            // If not, create a new list and put it in the map
            List<String> sub_list = new ArrayList<>();
            sttosub.put(student, sub_list);
        }


        List<String> sub_for_st = sttosub.get(student);// N list of subjects for particular  student

        if (sub_for_st.contains(subject) == false) {//check in list for  subject

            sub_for_st.add(subject);
            System.out.println("Subject added.");
        } else {

            System.out.println("Subject already allotted.");
        }
    }

    public void viewSubjectsOfStudent(String student) {
        if (sttosub.containsKey(student)) {
            List<String> subjects = sttosub.get(student);
            System.out.println("Subjects for " + student + ":");
            for (String sub : subjects) {
                System.out.println(sub);
            }
        } else {
            System.out.println("No subjects allotted to " + student);
        }
    }

    public void viewStudentsBySubject(String subject) {
        System.out.println("Students who chose subject " + subject + ":");
        boolean found = false;
        for (String student : sttosub.keySet()) {
            List<String> subjects = sttosub.get(student);
            if (subjects.contains(subject)) {
                System.out.println(student);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No students have chosen this subject.");
        }
    }

    public void displayAllAllotments() {
        System.out.println("All subject allotments:");
        for (Map.Entry<String, List<String>> entry : sttosub.entrySet()) {
            String student = entry.getKey();
            List<String> subjects = entry.getValue();
            System.out.print(student + ": ");
            for (String sub : subjects) {
                System.out.print(sub + " ");
            }
            System.out.println();
        }
    }


}
