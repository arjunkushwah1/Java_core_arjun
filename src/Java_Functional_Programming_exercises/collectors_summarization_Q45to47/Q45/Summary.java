package Java_Functional_Programming_exercises.collectors_summarization_Q45to47.Q45;

public class Summary
{
    private long totalCount;
    private double totalPrice;
    private double averageRating;

     public Summary(long totalCount, double totalPrice, double averageRating) {
        this.totalCount = totalCount;
        this.totalPrice = totalPrice;
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return "Books: " + totalCount + ", Total Price: " + totalPrice + ", Avg Rating: " + averageRating;
    }
}
