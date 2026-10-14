public class Customer {
    private String name;

    public Customer(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer's name cannot be blank!");
        }
        this.name = name.trim();
    }
}
