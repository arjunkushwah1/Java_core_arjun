package collection_worksheet_2.hands_on_2_objective.util;
import collection_worksheet_2.hands_on_2_objective.model.Student;
import java.util.Comparator;
public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        String name1 = s1.getS_name();
        String name2 = s2.getS_name();

        name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();

        if (name1.equals(name2)) {
            return 0;
        } else if (name1.compareTo(name2) < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
