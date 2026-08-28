package proxy;

public class ProxyDemo {
    public void run() {
        Account account = new BankAccountProxy("1234");
        account.showBalance();

        Account wrongAccount = new BankAccountProxy("9999");
        wrongAccount.showBalance();
    }
}

