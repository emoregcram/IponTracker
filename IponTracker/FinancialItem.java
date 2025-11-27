public abstract class FinancialItem {
    private String id;
    private String description;
    private String date;

    public FinancialItem(String id, String description, String date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    // Common details for ALL items
    public void displayBasicInfo() {
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Date: " + date);
    }

    public abstract void displayDetails();

    // Getters
    public String getId() { return id; }
    public String getDescription() { return description; }
    public String getDate() { return date; }
}
