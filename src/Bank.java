import java.util.ArrayList;

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private ArrayList<Branch> branches;

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branchExists = findBranch(branchName);
        if (branchExists != null) {
            return branchExists.newCustomer(customerName, initialAmount);
        }
        return false;
    }


    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }

        }
        return null;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double Amount) {
        Branch branchExists = findBranch(branchName);
        if (branchExists != null) {
            return branchExists.addTransaction(customerName, Amount);
        }
        return false;
    }

    public void printCustomersOfBranch(String branchName) {

        for (int i = 0; i < branches.size(); i++) {//wrong
            Branch exists = findBranch(branchName);
            if (exists != null) {
                branches.get(i).printCustomers();
            }
        }
    }
}
