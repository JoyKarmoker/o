import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Create instances of the classes and test the proxy pattern

        // Create warehouses
        Warehouse warehouse1 = new Warehouse("warehouse1");
        Warehouse warehouse2 = new Warehouse("warehouse2");

        List<Warehouse> warehouses = new ArrayList<>();
        warehouses.add(warehouse1);
        warehouses.add(warehouse2);

        // Create an instance of the proxy class
        IOrder orderFulfillment = new OrderFulfillment(warehouses);

        // Create an example order with items
        Order order = new Order();
        order.addItem(new Item("SKU123", "Laptop", 20));
        order.addItem(new Item("SKU456", "Mouse", 30));
        orderFulfillment.fulfillOrder(order);

        Order order2 = new Order();
        order2.addItem(new Item("SKU123", "Laptop", 20));
        order2.addItem(new Item("SKU456", "Mouse", 30));
        orderFulfillment.fulfillOrder(order2);

        Order order3 = new Order();
        order3.addItem(new Item("SKU123", "Laptop", 20));
        order3.addItem(new Item("SKU456", "Mouse", 30));
        orderFulfillment.fulfillOrder(order3);

        Order order4 = new Order();
        order4.addItem(new Item("SKU123", "Laptop", 20));
        order4.addItem(new Item("SKU456", "Mouse", 30));
        orderFulfillment.fulfillOrder(order4);

        Order order5 = new Order();
        order5.addItem(new Item("SKU123", "Laptop", 20));
        order5.addItem(new Item("SKU456", "Mouse", 30));
        orderFulfillment.fulfillOrder(order5);
    }
}
