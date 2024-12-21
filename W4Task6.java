package S3Workshop_4;

import java.util.HashMap;
import java.util.Map;

public class W4Task6 {
    private Map<String, Integer> stock = new HashMap<>();

    public void addProduct(String productName, int quantity) {
        stock.put(productName, quantity);
    }

    public boolean isProductAvailable(String productName, int quantity) {
        return stock.containsKey(productName) && stock.get(productName) >= quantity;
    }
    }
