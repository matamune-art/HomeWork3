package builder;

public class BuilderDemo {
    public void run() {
        User user1 = new User.Builder()
                .setName("Маша")
                .setPassword("pass123")
                .setEmail("masha@mail.ru")
                .setPhone("89001234567")
                .setCity("Москва")
                .setActive(true)
                .build();
        System.out.println("User 1: " + user1);

        User user2 = new User.Builder()
                .setName("Иван")
                .setPassword("ivan456")
                .setEmail("ivan@mail.ru")
                .build();
        System.out.println("User 2: " + user2);
    }
}
