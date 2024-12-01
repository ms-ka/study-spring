package HW_02.onlineShop;

import java.util.HashMap;
import java.util.Map;

//Zmniejszenie ilosci towarów na magazynie jesli dokonano zakupu

// Klasa Magazyn
public class Warehouse {
    private Map<String, Integer> products = new HashMap<>();

    public Warehouse() {
        // Inicjalizacja magazynu
        products.put("Laptop", 10);
        products.put("Book", 20);
        products.put("Flower", 6);
    }

    // Zmniejsz ilość produktu w magazynie
    public boolean takeProduct(String product, int amound) {
        if (products.containsKey(product) && products.get(product) >= amound) {
            products.put(product, products.get(product) - amound);
            System.out.println("Warehouse: Product " + product + " was delivered in quantity " + amound);
            return true;
        } else {
            System.out.println("Warehouse: Not enough product " + amound);
            return false;
        }
    }
}

