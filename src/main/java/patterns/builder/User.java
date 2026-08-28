package builder;

public class User {

    private final String name;
    private final String password;
    private final String email;
    private final String phone;
    private final String city;
    private final boolean isActive;

    private User(Builder builder) {
        this.name = builder.name;
        this.password = builder.password;
        this.email = builder.email;
        this.phone = builder.phone;
        this.city = builder.city;
        this.isActive = builder.isActive;
    }

    public String getName() { return name; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getCity() { return city; }
    public boolean isActive() { return isActive; }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', city='" + city + "'}";
    }

    public static class Builder {
        // Поля для заполнения
        private String name;
        private String password;
        private String email;
        private String phone = "";
        private String city = "";
        private boolean isActive = true;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setActive(boolean active) {
            isActive = active;
            return this;
        }

        public User build() {

            if (name == null || name.isEmpty()) {
                throw new IllegalStateException("Имя обязательно!");
            }
            if (password == null || password.isEmpty()) {
                throw new IllegalStateException("Пароль обязателен!");
            }
            if (email == null || email.isEmpty()) {
                throw new IllegalStateException("Email обязателен!");
            }

            return new User(this);
        }
    }
}
