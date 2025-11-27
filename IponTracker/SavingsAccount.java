import java.util.ArrayList;

public class SavingsAccount extends FinancialItem {
    private double balance;
    private double interestRate;

    private ArrayList<Expense> expenses = new ArrayList<>();
    private ArrayList<Goal> goals = new ArrayList<>();

    public SavingsAccount(String id, String description, String date, double balance, double interestRate) {
        super(id, description, date);
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n=== SAVINGS ACCOUNT (PRIORITY) ===");
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

    // ----- EXPENSE MANAGEMENT -----
    public void addExpense(Expense e) {
        expenses.add(e);
        balance -= e.getAmount();
    }

    public ArrayList<Expense> getExpenses() { return expenses; }

    // ----- GOAL MANAGEMENT -----
    public void addGoal(Goal g) {
        goals.add(g);
    }

    public ArrayList<Goal> getGoals() { return goals; }

    public double getBalance() { return balance; }
    public double getInterestRate() { return interestRate; }
}
