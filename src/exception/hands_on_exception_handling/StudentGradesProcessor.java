package exception.hands_on_exception_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentGradesProcessor {
    public static void main(String[] args) {
        String filePath = "src/exception/hands_on_exception_handling/grades.txt";
        List<String> validStudent = new ArrayList<>();
        List<String> failingStudent = new ArrayList<>();
        int total = 0;
        int count = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filePath));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if(line.isEmpty())continue;
                String[] parts=line.split("\\s+");
                if(parts.length != 2) {
                    System.out.println("invalid line formate");
                    continue;
                }
                String name = parts[0];
                String gradeStr = parts[1];

                try {
                    int grade = Integer.parseInt(gradeStr);
                    if (grade < 0 || grade > 100) {
                        throw new InvalidGradeException("Grade out of range " + name +" " + grade);
                    }
                    validStudent.add(name + " - " + grade);
                    total += grade;
                    count++;
                    if (grade < 40) {
                        failingStudent.add(name);
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("invalid number formate for grade: " + gradeStr);
                }
                catch (InvalidGradeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println(" file not found: " + filePath);
            System.exit(1);
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        System.out.println("\nValid Student and grades:");
        for(String s : validStudent) {
            System.out.println(s);
        }
        System.out.println("\nFailing Students:");
        for(String f : failingStudent) {
            System.out.println(f);
        }
        if(count > 0) {
            double avg = total / (double) count;
            System.out.println("\n Average Grade: %.2f\n" + avg);
        }
        else {
            System.out.println("\nNo valid grades to calculate average.");
        }
    }
}
