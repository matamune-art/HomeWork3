package chain;

public class PriceHandler extends Handler {
    @Override
    public void handle(Order order) {
        if (order.getPrice() <= 0) {
            System.out.println(order.getName() + " — ошибка: цена должна быть больше 0");
            return;
        }
        if (next != null) next.handle(order);
    }
}