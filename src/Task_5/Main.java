package Task_5;

public class Main {
    public static void main(String[] args) {
        Basket basket = new StoreBasket();

        basket.addProduct("Хлеб", 2);
        basket.addProduct("Молоко", 1);
        basket.addProduct("Хлеб", 1);

        System.out.println("В корзине: " + basket.getProducts());
        System.out.println("Количество хлеба: " + basket.getProductQuantity("Хлеб") + " штуки");

        basket.clear();
        System.out.println("В корзине: " + basket.getProducts());
    }
}
