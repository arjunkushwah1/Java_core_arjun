package collection_worksheet_2.Q2_unique_word_frequency_counter;

import java.util.*;

public class Operation
{
    public ArrayList<String> aa=new ArrayList<>();


    private ArrayList<String> wordslist;
    private Map<String, Integer> frequencyMap;
    private TreeSet<String> uniqueWords;

    public Operation()
    {
    }
    public Operation(String s)
    {
        s = s.toLowerCase().replaceAll("[^a-z ]", ""); // here we split String in words and avoid unnecessary characters
        String splitword[]=s.split("\\s+");

        wordslist=new ArrayList<>(Arrays.asList(splitword));
        frequencyMap=new HashMap<>();
        uniqueWords=new TreeSet<>();
        for (String word : wordslist) {
            if (word.isEmpty()) {
                // do nothing
            }
            else {
                uniqueWords.add(word);

                if (frequencyMap.containsKey(word)) {
                    frequencyMap.put(word, frequencyMap.get(word) + 1);
                } else {
                    frequencyMap.put(word, 1);
                }
            }
        }

    }

    public int getUniqueWordCount()
    {
        return uniqueWords.size();
    }

    public void displayFrequencies() {
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public void displaySortedWords() {
        for (String word : uniqueWords) {
            System.out.print(word+" ");
        }
    }


}
