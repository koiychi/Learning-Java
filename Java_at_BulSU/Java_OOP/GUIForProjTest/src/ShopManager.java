import java.util.ArrayList;
import java.util.List;

public class ShopManager {
    private List<Customer> customerList = new ArrayList<>();

    public void registerCustomer(String name) {
        Customer customer = new Customer(name);
        customerList.add(customer);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
