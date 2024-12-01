package HW_02.onlineShop;

//Przyjmowanie zamówienie i proces realizacji zakupu

public class OnlineShop {
    private Warehouse warehouse;
    private User user;

    public OnlineShop(Warehouse warehouse, User user) {
        this.warehouse = warehouse;
        this.user = user;
    }
    // Złożenie zamówienia
    public void takeOrder(String product, int amound, double sum) {
        System.out.println("Shop: Start of order processing: " + product + ", quantity: " + amound);
        boolean madeWarehouse = warehouse.takeProduct(product, amound);
        boolean madeUser = user.debitBalance(sum * amound);

        if (madeWarehouse && madeUser) {
            System.out.println("Shop: Order completed successfully!");
        } else {
            System.out.println("Shop: The order cannot be processed.");
        }
    }
}
