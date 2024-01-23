public class Item {
    private String item_id;
    private String productName;

    private Integer quantity;

    public Item(String item_id, String productName, Integer quantity) {
        this.item_id = item_id;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getId() {
        return item_id;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity()
    {
        return quantity;
    }
}
