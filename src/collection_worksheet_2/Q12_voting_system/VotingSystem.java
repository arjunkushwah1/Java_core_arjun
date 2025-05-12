package collection_worksheet_2.Q12_voting_system;

import java.util.*;

public class VotingSystem
{
    Map<String,Integer> map = new HashMap<>();

    public void addvote(String name)
    {
        if(!map.containsKey(name))
        {
            map.put(name,1);
        }
        else
        {
            map.put(name,map.get(name)+1);
        }
    }
    public void showResults() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                int v1 = e1.getValue();
                int v2 = e2.getValue();

                if (v2 > v1) {
                    return 1;
                } else if (v2 < v1) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
}
