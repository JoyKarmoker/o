import java.util.List;

public class OrderFulfillment implements IOrder {
    private List<Warehouse> warehouses;

    public OrderFulfillment(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public void fulfillOrder(Order order) {
            boolean canFulfillOrder = true;
            for (Warehouse warehouse : warehouses)
            {
                canFulfillOrder = true;
                for (Item item : order.getItemList())
                {
                    // Check if the item is in stock in the warehouse
                    if (warehouse.currentInventory(item) < item.getQuantity())
                    {
                        canFulfillOrder = false;
                        // If in stock, create a new order for that warehouse
                        break; // Move to the next warhouse
                    }
                }

                if(canFulfillOrder)
                {
                    // here print the warehouse name the order is forwared to
                    System.out.println("Order is forwarded to: " + warehouse.getAddress());
                    warehouse.fulfillOrder(order);
                    System.out.println("\n");
                    break;
                }
            }

            if(!canFulfillOrder)
            {
                System.out.println("Can not fullfill this order");
            }
    }
}
