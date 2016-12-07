import java.util.ArrayList;

/**
 * Created by strejolopez on 12/2/16.
 */
public class Item {
    private String name;
    private int price;
    private int qStock;
    private String category;

    public Item(String name, int price, int qStock, String category){
        this.name = name;
        this.price = price;
        this.qStock = qStock;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantitInStock() {
        return qStock;
    }

    public void setQuantitInStock(int qStock) {
        this.qStock = qStock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static Item creatItem(String name, int price, int qStock, String category){
        name.add("");
        price.add("");
        qStock.add("");
        category.add("");

    }
}
