package collection_worksheet_2.Q7_movie_rating_aggregator;

import java.util.*;

public class MovieRatingAggregator
{
    Map<String, List<Integer>> map;

    public MovieRatingAggregator() {
        this.map = new HashMap<>();
    }

    public void addMovie(String name, int rating) {
        if (!map.containsKey(name)) {
            List<Integer> list = new ArrayList<>();
            list.add(rating);
            map.put(name, list);
        } else {
            map.get(name).add(rating); // adding if exists key
        }
    }

    public void displayAverageratingSorted()
    {
        List<String> movieNames = new ArrayList<>(map.keySet());

        Collections.sort(movieNames, new Comparator<String>() {
            @Override
            public int compare(String m1, String m2)
            {
                double a1=calAverage(map.get(m1));
                double a2=calAverage(map.get(m2));
                if (a1 > a2) {
                    return -1;
                } else if (a1 < a2) {
                    return 1;
                } else {
                    return 0;
                }

            }
        });
        for (String movie : movieNames) {
            double avg = calAverage(map.get(movie));
            System.out.println(movie + " - Average Rating: " + avg);
        }
    }
    private double calAverage(List<Integer> ratings) {
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }

        if (ratings.isEmpty()) {
            return 0;
        } else {
            return (double) sum / ratings.size();
        }
    }
}
