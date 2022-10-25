package Mall;

import Mall.Persons.Customer;
import Mall.Persons.Salesperson;
;
import java.util.List;

public interface MallSystem {
    List<Store> retrieveStores();

    List<Salesperson> retrieveEmployees();

    List<Customer> retrieveCustomers();

    double retrieveProfit();
}
