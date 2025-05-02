package collection_worksheet_2.hands_on_2_objective.util;
import collection_worksheet_2.hands_on_2_objective.model.Course;
import java.util.Comparator;
public class CourseEnrollmentComparator  implements Comparator<Course> {
    public int compare(Course c1, Course c2) {
        int size1 = c1.getEnrolledStudents().size();
        int size2 = c2.getEnrolledStudents().size();

        if (size1 > size2) {
            return -1;
        } else if (size1 < size2) {
            return 1;
        } else {
            return 0;
        }
    }
}
