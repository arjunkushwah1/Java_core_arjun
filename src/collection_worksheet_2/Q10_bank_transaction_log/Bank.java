package collection_worksheet_2.Q10_bank_transaction_log;

import java.util.*;

public class Bank
{
    private Map<String, List<Transaction>> transmap = new HashMap<>();

    public void addTransaction(String accountNumber, double amount, String type) {
        Transaction tx = new Transaction(amount, type);

        if (transmap.containsKey(accountNumber)) {
            transmap.get(accountNumber).add(tx);
        }
        else {
            List<Transaction> list = new ArrayList<>();
            list.add(tx);
            transmap.put(accountNumber, list);
        }
    }
    public void printStatement(String accountNumber) {
        if (!transmap.containsKey(accountNumber)) {
            System.out.println("No transactions found for account: " + accountNumber);
            return;
        }

        List<Transaction> list = transmap.get(accountNumber);

        // Sort using if-else comparator
        Collections.sort(list, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction t1, Transaction t2) {
                if (t1.getTimestamp().isBefore(t2.getTimestamp())
                ) {
                    return -1;
                } else if (t1.getTimestamp().isAfter(t2.getTimestamp())
                ) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("Transaction statement for account: " + accountNumber);
        for (Transaction tx : list) {
            System.out.println(tx);
        }
    }
}
