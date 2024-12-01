package HW_02.onlineShop;

public class SimplyApp {
    public static void main(String[] args) {
        // Inicjalizacja systemu
        Warehouse warehouse = new Warehouse();
        User user = new User(4000.0); // Saldo początkowe
        OnlineShop shop = new OnlineShop(warehouse, user);

        // Złożenie zamówienia
        shop.takeOrder("Laptop", 1, 2300.0);
    }
}
