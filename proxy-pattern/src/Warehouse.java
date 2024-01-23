import java.util.Hashtable;

public class Warehouse implements IOrder {
    private Hashtable<String, Integer> stock;
    private String address;

    public Warehouse(String address) {
        this.stock = new Hashtable<>();
        // Initialize stock (for example purposes)
        stock.put("SKU123", 50);
        stock.put("SKU456", 100);
        this.address = address;
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.getItemList()) {
            stock.replace(item.getId(), stock.get(item.getId()) - item.getQuantity());
            // Process the order for shipment and delivery
            System.out.println("Fulfilled order for SKU: " + item.getId() + ", Product: " + item.getProductName());
        }
    }

    public int currentInventory(Item item) {
        return stock.getOrDefault(item.getId(), 0);
    }

    public String getAddress() {
        return address;
    }
}
