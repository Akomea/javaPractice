import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
//        ArrayList<Integer> myIntValues = new ArrayList<>();
//        for (int i=0; i<=10; i++) {
//            myIntValues.add(i);
//        }
//        for (int i=0; i<myIntValues.size(); i++) {
//            int values = myIntValues.get(i);
//            System.out.println(i+ "-->"+values);

//        }
        Bank bank = new Bank("CCB");
        bank.addBranch("Shenyang");
        bank.addCustomer("Shenyang", "Akomea Kenneth", 344.23);
        bank.addCustomer("Shenyang", "Max Kasperoski", 90.99);
        bank.addCustomer("Shenyang", "Matilda Owusu", 5.00);
        bank.addCustomer("Shenyang", "Olivia Brago", 2.00);
        bank.addCustomer("Shenyang", "Liana", 1000);


        bank.printCustomersOfBranch("Shenyang");
        bank.addCustomerTransaction("Shenyang", "Akomea Kenneth", 89.00);


    }
}
