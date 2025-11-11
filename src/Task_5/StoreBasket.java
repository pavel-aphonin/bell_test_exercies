package Task_5;
import java.util.*;

public class StoreBasket implements Basket {
    private final Map<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        products.merge(product, quantity, Integer::sum);
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, quantity);
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }
}
