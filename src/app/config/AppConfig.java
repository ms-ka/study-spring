package app.config;

import app.staff.Secretary;
import app.staff.administration.Director;
import app.staff.administration.ProductionChef;
import app.staff.administration.SalesChef;
import app.staff.specialists.production.MachineOperator;
import app.staff.specialists.production.StoreKeeper;
import app.staff.specialists.sales.Merchendiser;
import app.staff.specialists.sales.SalesManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//anotacja podlaczenia biblioteki

@Configuration
public class AppConfig {

    //Bean to obiekt który tworzy się i znajduje w bibliotece Spring

    //Spring context to storage dla bean

    @Bean
    public Director director() {
        return new Director();
    }

    @Bean
    ProductionChef getProductionChef() {
        return new ProductionChef();
    }

    @Bean public SalesChef getSalesChef() {
        return new SalesChef();
    }
    @Bean
    public MachineOperator getMachineOperator() {
        return new MachineOperator();
    }
    @Bean
    public StoreKeeper getStoreeKeeper(){
        return new StoreKeeper();
    }
    @Bean
    public Merchendiser getMerchendiser(){
        return new Merchendiser();
    }
    @Bean
    public SalesManager getSalesManager(){
        return new SalesManager();
    }
    @Bean
    public Secretary getSecretary(){
        return new Secretary();
    }
}