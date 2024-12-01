package HW_02.onlineShop;

//zmniejszenie balansu użytkownika, jesli dokonal zakupu

public class User {
    private double balance;

    public User(double initialBalance) {
        this.balance = initialBalance;
    }

    // Odejmij koszt od salda klienta
    public boolean debitBalance(double sum) {
        if (balance >= sum) {
            balance -= sum;
            System.out.println("Customer Account: Balance reduced by " + sum + ". Actual balance: " + balance);
            return true;
        } else {
            System.out.println("Customer Account: Insufficient funds in account!");
            return false;
        }
    }
}
