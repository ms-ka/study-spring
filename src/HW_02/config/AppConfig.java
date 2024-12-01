package HW_02.config;

// wrzucenie Fremdworka z Springiem i konfiguracja

import HW_02.onlineShop.OnlineShop;
import HW_02.onlineShop.User;
import HW_02.onlineShop.Warehouse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Konfiguracja Springa
@Configuration
public class AppConfig  {
    @Bean
    public Warehouse warehouse() {
        return new Warehouse();
    }

    @Bean
    public User user() {
        return new User(4000.0);
    }

    @Bean
    public OnlineShop shop(Warehouse warehouse, User user) {
        return new OnlineShop(warehouse, user);
    }
}

