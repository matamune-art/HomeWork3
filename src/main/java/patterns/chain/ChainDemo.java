package chain;

public class ChainDemo {
    public void run() {
        Handler priceHandler = new PriceHandler();
        Handler nameHandler = new NameHandler();
        priceHandler.setNext(nameHandler);

        priceHandler.handle(new Order("Ноутбук", 50000));
        priceHandler.handle(new Order("Телефон", -100));
        priceHandler.handle(new Order("", 1000));
    }
}
