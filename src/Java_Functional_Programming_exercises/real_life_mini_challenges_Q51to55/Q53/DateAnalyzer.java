package Java_Functional_Programming_exercises.real_life_mini_challenges_Q51to55.Q53;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DateAnalyzer
{

    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2023, 5, 10),
                LocalDate.of(2024, 1, 15),
                LocalDate.of(2022, 12, 25),
                LocalDate.of(2025, 3, 8)
        );

        Comparator<LocalDate> dateComparator = Comparator.naturalOrder();
        Optional<LocalDate> earliest = dates.stream().min(dateComparator);
        Optional<LocalDate> latest = dates.stream().max(dateComparator);
        if (earliest.isPresent() && latest.isPresent()) {
            System.out.println("Earliest date: " + earliest.get());
            System.out.println("Latest date: " + latest.get());
        } else {
            System.out.println("Date list is empty.");
        }
    }
}
