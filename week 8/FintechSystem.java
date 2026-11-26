// This program applies Abstract Classes and Polymorphism to a Fintech scenario.

public class FintechSystem {

    abstract static class PaymentMethod {
        protected String accountName;

        public PaymentMethod(String accountName) {
            this.accountName = accountName;
        }

        public abstract void processPayment(double amount);
    }

    static class MpesaPayment extends PaymentMethod {
        private final String phoneNumber;

        public MpesaPayment(String accountName, String phoneNumber) {
            super(accountName);
            this.phoneNumber = phoneNumber;
        }

        @Override
        public void processPayment(double amount) {
            System.out.println("Processing M-Pesa payment of KSh " + amount
                    + " for " + accountName);
            System.out.println(" Sending STK push to: " + phoneNumber);
        }
    }

    static class CardPayment extends PaymentMethod {
        private final String cardNumber;

        public CardPayment(String accountName, String cardNumber) {
            super(accountName);
            this.cardNumber = cardNumber;
        }

        @Override
        public void processPayment(double amount) {
            System.out.println("Processing Credit Card payment of KSh " + amount
                    + " for " + accountName);
            System.out.println(" Charging card ending in: "
                    + cardNumber.substring(cardNumber.length() - 4));
        }
    }

    public static void main(String[] args) {
        PaymentMethod[] cart = new PaymentMethod[3];

        cart[0] = new MpesaPayment("Alice", "0712345678");
        cart[1] = new CardPayment("Bob", "1234567812345678");
        cart[2] = new MpesaPayment("Charlie", "0798765432");

        double totalRevenue = 0.0;

        System.out.println("=== PROCESSING TRANSACTIONS ===");

        for (PaymentMethod payment : cart) {
            double amount = 1500.0;
            payment.processPayment(amount);
            totalRevenue += amount;
            System.out.println("-------------------------");
        }

        System.out.println("Total Revenue Collected: KSh " + totalRevenue);
    }
}
