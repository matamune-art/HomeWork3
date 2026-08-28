package chain;

public class NameHandler extends Handler {
    @Override
    public void handle(Order order) {
        if (order.getName() == null || order.getName().isEmpty()) {
            System.out.println("Ошибка: имя заказа пустое");
            return;
        }
        if (next != null) next.handle(order);
        else System.out.println("Заказ \"" + order.getName() + "\" принят!");
    }
}