import java.util.ArrayList;
import java.util.Scanner;

public class FinancialTracker {

    private static ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n=== IPON TRACKER (SAVINGS-PRIORITY) ===");
            System.out.println("[1] Add Savings Account");
            System.out.println("[2] Add Expense to Savings");
            System.out.println("[3] Add Goal to Savings");
            System.out.println("[4] View Summary");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addSavings(scanner);
                    break;
                case 2:
                    if (checkSavingsEmpty()) break;
                    addExpense(scanner);
                    break;
                case 3:
                    if (checkSavingsEmpty()) break;
                    addGoal(scanner);
                    break;
                case 4:
                    if (checkSavingsEmpty()) break;
                    viewSummary();
                    break;
                case 0:
                    System.out.println("Thank you for using IPON Tracker!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }

    private static boolean checkSavingsEmpty() {
        if (savingsAccounts.isEmpty()) {
            System.out.println("❗ You must add a SAVINGS ACCOUNT first!");
            return true;
        }
        return false;
    }

    private static void addSavings(Scanner scanner) {
        System.out.print("Savings ID: ");
        String id = scanner.nextLine();
        System.out.print("Description: ");
        String desc = scanner.nextLine();
        System.out.print("Balance: ");
        double bal = scanner.nextDouble();
        System.out.print("Interest Rate: ");
        double rate = scanner.nextDouble();
        scanner.nextLine();

        savingsAccounts.add(new SavingsAccount(id, desc, "2025-11-27", bal, rate));
        System.out.println("Savings account added successfully!");
    }

    private static SavingsAccount selectSavings(Scanner scanner) {
        System.out.println("Select Savings Account:");
        for (int i = 0; i < savingsAccounts.size(); i++) {
            System.out.println("[" + i + "] " + savingsAccounts.get(i).getDescription());
        }
        System.out.print("Choice: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        return savingsAccounts.get(index);
    }

    private static void addExpense(Scanner scanner) {
        SavingsAccount selected = selectSavings(scanner);

        System.out.print("Expense ID: ");
        String id = scanner.nextLine();
        System.out.print("Description: ");
        String desc = scanner.nextLine();
        System.out.print("Amount: ");
        double amt = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Category: ");
        String cat = scanner.nextLine();

        selected.addExpense(new Expense(id, desc, "2025-11-27", amt, cat));
        System.out.println("Expense added under selected savings account.");
    }

    private static void addGoal(Scanner scanner) {
        SavingsAccount selected = selectSavings(scanner);

        System.out.print("Goal ID: ");
        String id = scanner.nextLine();
        System.out.print("Description: ");
        String desc = scanner.nextLine();
        System.out.print("Goal Amount: ");
        double amt = scanner.nextDouble();
        scanner.nextLine();

        selected.addGoal(new Goal(id, desc, "2025-11-27", amt));
        System.out.println("Goal added under selected savings account.");
    }

    private static void viewSummary() {
        System.out.println("\n=== OVERALL SUMMARY (SAVINGS PRIORITY) ===");

        for (SavingsAccount sa : savingsAccounts) {
            sa.displayDetails();

            System.out.println("\n--- EXPENSES UNDER THIS SAVINGS ---");
            if (sa.getExpenses().isEmpty())
                System.out.println("No expenses.");
            else
                for (Expense e : sa.getExpenses()) e.displayDetails();

            System.out.println("\n--- GOALS UNDER THIS SAVINGS ---");
            if (sa.getGoals().isEmpty())
                System.out.println("No goals.");
            else
                for (Goal g : sa.getGoals()) g.displayDetails();

            System.out.println("-------------------------------------");
        }
    }
}
