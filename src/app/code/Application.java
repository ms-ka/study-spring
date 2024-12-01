package app.code;

import app.staff.Secretary;
import app.staff.administration.Director;
import app.staff.administration.ProductionChef;
import app.staff.administration.SalesChef;
import app.staff.specialists.production.MachineOperator;
import app.staff.specialists.production.StoreKeeper;
import app.staff.specialists.sales.Merchendiser;
import app.staff.specialists.sales.SalesManager;

public class Application {

    public static void main(String[] args) {
        MachineOperator machineOperator = new MachineOperator();
        StoreKeeper storeKeeper = new StoreKeeper();

        Merchendiser merchendiser = new Merchendiser();
        SalesManager salesManager = new SalesManager();

        Secretary secretary = new Secretary();

        ProductionChef productionChef = new ProductionChef();
        productionChef.setMachineOperator(machineOperator);
        productionChef.setStoreKeeper(storeKeeper);

        SalesChef salesChef = new SalesChef();
        salesChef.setMerchendiser(merchendiser);
        salesChef.setSalesManager(salesManager);

        Director director = new Director();
        director.setSecretary(secretary);
        director.setProductionChef(productionChef);
        director.setSalesChef(salesChef);

        director.manageCompany();
    }
}
