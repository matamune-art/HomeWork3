package proxy;

public class BankAccount implements Account {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
        System.out.println("Загрузка данных счёта...");
    }

    @Override
    public void showBalance() {
        System.out.println("Баланс: " + balance + " руб.");
    }
}