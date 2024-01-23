public class User{
    public static void main(String[] args) {
        // Create a vending machine with 5 products
        VendingMachine vendingMachine = new VendingMachine(5);

        // Insert a dollar and dispense a product
        vendingMachine.insertDollar();
        vendingMachine.dispense();
        System.out.println();

        // Try inserting a dollar when one is already inserted
        vendingMachine.insertDollar();
        vendingMachine.insertDollar();
        // Eject money
        vendingMachine.ejectMoney();
        System.out.println();

        // Dispense all products
        vendingMachine.insertDollar();
        vendingMachine.dispense();
        System.out.println();

        vendingMachine.insertDollar();
        vendingMachine.dispense();
        System.out.println();

        vendingMachine.insertDollar();
        vendingMachine.dispense();
        System.out.println();

        //Last product
        vendingMachine.insertDollar();
        vendingMachine.dispense();
        System.out.println();

        // Try to dispense a product when out of stock
        vendingMachine.insertDollar();
        vendingMachine.dispense();
        System.out.println();
    }
}