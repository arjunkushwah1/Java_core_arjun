package Java_Functional_Programming_exercises.data_processing_transformation_Q31to35.Q31;

import java.util.*;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(100.0, "debit"),
                new Transaction(50.0, "credit"),
                new Transaction(200.0, "debit"),
                new Transaction(30.0, "debit")
        );

        double totalDebitAmount = transactions.stream()
                .filter(transaction -> "debit".equalsIgnoreCase(transaction.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();

        System.out.println("total d amount: " + totalDebitAmount);
    }


}
