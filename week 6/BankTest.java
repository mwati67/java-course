public class BankTest {
    private static class BankAccount {
        private final String accountNumber;
        private final String accountHolderName;
        private double balance;

        public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== OPENING ACCOUNT ===");
        // Create a new account with an initial balance of 5000
        BankAccount myAccount = new BankAccount("ACC-001", "Alice Wanjiku", 5000.00);
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Account Holder: " + myAccount.getAccountHolderName());
        System.out.println("Initial Balance: KSh " + myAccount.getBalance());

        System.out.println("\n=== DEPOSITING ===");
        myAccount.deposit(2500.50);
        myAccount.deposit(-100); // Should fail (negative amount)

        System.out.println("\n=== WITHDRAWING ===");
        myAccount.withdraw(2000);
        myAccount.withdraw(10000); // Should fail (insufficient funds)
        myAccount.withdraw(-50); // Should fail (negative amount)

        System.out.println("\n=== FINAL STATE ===");
        System.out.println("Final Balance: KSh " + myAccount.getBalance());
    }
}
