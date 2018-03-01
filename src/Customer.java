import java.util.ArrayList;

public class Customer {
    private String name;
    private static ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        transactions.add(initialAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransactions(double amount) {
        transactions.add(amount);
    }
}
