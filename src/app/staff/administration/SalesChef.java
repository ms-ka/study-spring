package app.staff.administration;

import app.staff.specialists.sales.Merchendiser;
import app.staff.specialists.sales.SalesManager;
import org.springframework.beans.factory.annotation.Autowired;

public class SalesChef {
    @Autowired
    private Merchendiser merchendiser;
    @Autowired
    private SalesManager salesManager;

    public void giveOrders() {
        merchendiser.work();
        salesManager.work();
    }

    public Merchendiser getMarchendiser() {
        return merchendiser;
    }

    public void setMarchendiser(Merchendiser merchendiser) {
        this.merchendiser = merchendiser;
    }

    public SalesManager getSalesManager() {
        return salesManager;
    }

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }

    public void setMerchendiser(Merchendiser merchendiser) { this.merchendiser = merchendiser; }
    }

