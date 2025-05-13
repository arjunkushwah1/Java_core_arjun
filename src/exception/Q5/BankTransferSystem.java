package exception.Q5;
import java.util.HashMap;
import java.util.Map;
class Account {
     int id;
     double balance;
    Account(int id,double balance) {
        this.id=id;
        this.balance=balance;
    }
}
public class BankTransferSystem {
     static Map<Integer,Account> accountMap=new HashMap<>();
    public static  void transferFund(int fromId , int toId,double amount) {
        Account from=accountMap.get(fromId);
        Account to= accountMap.get(toId);
        if(from==null) {
            System.out.println("source acc not found ");
            return;
        }
        if(from.balance <amount) {
            System.out.println("insufficient fund in source acc");
            return;
        }

        try {
            from.balance =from.balance-amount;
            if (to == null) {
                throw new RuntimeException("target account not found.");
            }
            to.balance += amount;

            System.out.println("transferred $" + amount + " from acc " + fromId + " to " + toId);
        }
        catch (RuntimeException e) {
            from.balance = from.balance+amount;
            System.out.println("transfer failed. rolled back. reason: "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        accountMap.put(1,new Account(1,1000));
        accountMap.put(2,new Account(2,500));
        transferFund(1,2,200);
        transferFund(1,99,100);// target transation  failure
        System.out.println("acc 1 balance: "+accountMap.get(1).balance);
        System.out.println("acc 2 balance: "+accountMap.get(2).balance);
    }
}