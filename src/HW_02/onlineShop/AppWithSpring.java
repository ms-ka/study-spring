package HW_02.onlineShop;
// Klasa główna z Spring


import HW_02.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppWithSpring {
    public static void main(String[] args) {
        // Inicjalizacja kontenera Spring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Pobranie sklepu z kontekstu Springa
        OnlineShop shop = context.getBean(OnlineShop.class);

        // Złożenie zamówienia
        shop.takeOrder("Laptop", 2, 1300.0);

        // Zamknięcie kontekstu Springa
        context.close();
    }
}
