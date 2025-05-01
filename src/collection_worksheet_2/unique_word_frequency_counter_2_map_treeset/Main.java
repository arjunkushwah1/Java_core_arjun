package collection_worksheet_2.unique_word_frequency_counter_2_map_treeset;

import collection_worksheet_2.student_mangaement_1.Student;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello! in frequency counter");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a pragraph : ");
        String str=sc.nextLine();

        Operation op=new Operation(str);
        int choice=0;
        do {
            System.out.println("\n1. For Number Of Unique Word");
            System.out.println("2. Frequency Of each word");
            System.out.println("3. All words as alphabetically");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Unique words: " + op.getUniqueWordCount());
                    break;
                case 2:
                    op.displayFrequencies();
                    break;
                case 3:
                    op.displaySortedWords();
                    break;
                case 4:
                    System.out.println("Exiting ...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);



    }
}
