package collection_worksheet_2.Q7_movie_rating_aggregator;

public class Main
{
    public static void main(String[] args) {
        MovieRatingAggregator aggregator = new MovieRatingAggregator();

        aggregator.addMovie("Inception", 5);
        aggregator.addMovie("Inception", 4);
        aggregator.addMovie("Interstellar", 5);
        aggregator.addMovie("Interstellar", 4);
        aggregator.addMovie("Tenet", 3);
        aggregator.addMovie("Tenet", 2);

        aggregator.addMovie("Mass", 5);
        aggregator.addMovie("Mass", 5);
        aggregator.addMovie("Mass", 5);


        aggregator.displayAverageratingSorted();
    }
}
