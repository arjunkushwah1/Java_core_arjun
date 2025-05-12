package collection_worksheet_2.Q9_leder_board_tracker;

public class Main
{
    public static void main(String[] args) {
        LeaderBoard board = new LeaderBoard();
        board.addOrUpdate("Alice", 950);
        board.addOrUpdate("Bob", 75);
        board.addOrUpdate("Charlie", 60);
        board.showLeaderboard();
        // Update a score
        board.addOrUpdate("Charlie", 600);
        board.addOrUpdate("Alice", 800);
        // Show updated leaderboard
        board.showLeaderboard();
    }
}
