package collection_worksheet_2.Q9_leder_board_tracker;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LeaderBoard {
    Set<Player> player = new TreeSet<>(new Comparator<Player>()
    {
        @Override
        public int compare(Player p1, Player p2) {
            if (p1.getName().equals(p2.getName())) {
                return 0; // Same player (unique by name)
            }

            int scoreCompare = Integer.compare(p2.getScore(), p1.getScore());
            if (scoreCompare != 0) return scoreCompare;

            return p1.getName().compareTo(p2.getName()); // Tie-breaker if needed
        }
    });

    public void addOrUpdate(String name, int score)
    {
        //Player p = new Player(score,name);
        player.remove(new Player(score, name));
        player.add(new Player(score, name));
    }
    public void showLeaderboard()
    {
        System.out.println("\nLeaderboard:");
        for (Player p : player) {
            System.out.println(p);
        }
    }
}
