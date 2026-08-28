package proxy;

public class BankAccountProxy implements Account {
    private BankAccount realAccount;
    private String pin;

    public BankAccountProxy(String pin) {
        this.pin = pin;
    }

    @Override
    public void showBalance() {
        if (checkPin()) {
            if (realAccount == null) {
                realAccount = new BankAccount(10000);
            }
            realAccount.showBalance();
        } else {
            System.out.println("Неверный PIN-код!");
        }
    }

    private boolean checkPin() {
        return pin.equals("1234");
    }
}