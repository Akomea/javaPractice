import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double tramsactionAmount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            customers.add(new Customer(customerName, tramsactionAmount));
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }

        }
        return null;
    }

    public void printCustomers() {
        for(int i=0; i<customers.size(); i++) {
            System.out.println(i+1+". "+ customers.get(i).getName());
        }
    }

}
