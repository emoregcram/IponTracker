import java.util.ArrayList;
import java.util.Scanner;

public class FinancialTracker {
    private static ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();
    private static ArrayList<Expense> expenses = new ArrayList<>();
    private static ArrayList<Goal> goals = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            // Display menu
            System.out.println("\n=== IPON TRACKER ===");
            System.out.println("[1] Add Savings");
            System.out.println("[2] Record Expense");
            System.out.println("[3] Set Goal");
            System.out.println("[4] View Summary");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addSavings(scanner);
                    break;
                case 2:
                    recordExpense(scanner);
                    break;
                case 3:
                    setGoal(scanner);
                    break;
                case 4:
                    viewSummary();
                    break;
                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);
    }

    // ========== MENU FUNCTIONS ==========
    
    private static void addSavings(Scanner scanner) {
        System.out.print("Enter Savings Account ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter Interest Rate: ");
        double interestRate = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        SavingsAccount savings = new SavingsAccount(id, description, "2025-11-27", balance, interestRate);
        savingsAccounts.add(savings);
        System.out.println("Savings account added.");
    }

    private static void recordExpense(Scanner scanner) {
        System.out.print("Enter Expense ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Category: ");
        String category = scanner.nextLine();

        Expense expense = new Expense(id, description, "2025-11-27", amount, category);
        expenses.add(expense);
        System.out.println("Expense recorded.");
    }

    private static void setGoal(Scanner scanner) {
        System.out.print("Enter Goal ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Goal Amount: ");
        double goalAmount = scanner.nextDouble();
        scanner.nextLine();

        Goal goal = new Goal(id, description, "2025-11-27", goalAmount);
        goals.add(goal);
        System.out.println("Goal set.");
    }

    private static void viewSummary() {
        System.out.println("\n=== SUMMARY ===");

        System.out.println("\nSavings Accounts:");
        for (SavingsAccount s : savingsAccounts) {
            s.displayDetails();
        }

        System.out.println("\nExpenses:");
        for (Expense e : expenses) {
            e.displayDetails();
        }

        System.out.println("\nGoals:");
        for (Goal g : goals) {
            g.displayDetails();
        }
    }
}
