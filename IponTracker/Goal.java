public class Goal extends FinancialItem {
    private double goalAmount;
    private double currentProgress;

    public Goal(String id, String description, String date, double goalAmount) {
        super(id, description, date);
        this.goalAmount = goalAmount;
        this.currentProgress = 0;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Goal ---");
        displayBasicInfo();
        System.out.println("Goal Amount: ₱" + goalAmount);
        System.out.println("Current Progress: ₱" + currentProgress);
    }

    public void updateProgress(double amount) {
        currentProgress += amount;
    }

    public double getGoalAmount() { return goalAmount; }
    public double getCurrentProgress() { return currentProgress; }
}
