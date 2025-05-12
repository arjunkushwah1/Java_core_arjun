package Java_Functional_Programming_exercises.collectors_summarization_Q45to47.Q45;

public class Book
{
    private String title;
    private double price;
    private double rating;

    public Book(String title, double price, double rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}
