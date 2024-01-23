import java.util.Hashtable;

public class Order {
    public Hashtable<String, Integer> itemList;

    void placeOrder(String item, Integer units) {
        itemList.put(item, units);
    }
}
