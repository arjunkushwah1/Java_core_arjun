    package Day_One_Hand_On;

    // SavingsAccount.java
    public class SavingsAccount extends BankAccount {

        public SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public void showAccountType() {
            System.out.println("Account Type: Savings Account");
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        @Override
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    }
