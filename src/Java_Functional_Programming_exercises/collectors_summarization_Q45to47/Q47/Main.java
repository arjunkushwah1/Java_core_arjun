package Java_Functional_Programming_exercises.collectors_summarization_Q45to47.Q47;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Comment> comments = Arrays.asList(
                new Comment("alice", "Nice post!"),
                new Comment("bob", "Thanks for sharing."),
                new Comment("alice", "I agree."),
                new Comment("charlie", "Interesting."),
                new Comment("bob", "Great job."),
                new Comment("alice", "Well explained.")
        );

        // Count number of comments per user
        Map<String, Long> commentCounts = comments.stream()
                .collect(Collectors.groupingBy(
                        Comment::getUser,
                        Collectors.counting()
                ));

        commentCounts.forEach((user, count) ->
                System.out.println(user + " → " + count)
        );
    }
}
