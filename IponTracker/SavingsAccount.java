public class SavingsAccount extends FinancialItem {
    private double balance;
    private double interestRate;

    public SavingsAccount(String id, String description, String date, double balance, double interestRate) {
        super(id, description, date);
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Savings Account ---");
        displayBasicInfo();
        System.out.println("Balance: ₱" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public void addAmount(double amount) {
        balance += amount;
    }

    public void applyInterest() {
        balance += balance * interestRate / 100;
    }

    public double getBalance() { return balance; }
    public double getInterestRate() { return interestRate; }
}
