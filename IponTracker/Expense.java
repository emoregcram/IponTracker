public class Expense extends FinancialItem {
    private double amount;
    private String category;

    public Expense(String id, String description, String date, double amount, String category) {
        super(id, description, date);
        this.amount = amount;
        this.category = category;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Expense ---");
        displayBasicInfo();
        System.out.println("Amount: ₱" + amount);
        System.out.println("Category: " + category);
    }

    public double getAmount() { return amount; }
    public String getCategory() { return category; }
}
