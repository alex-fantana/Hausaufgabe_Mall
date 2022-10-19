package Mall;

import Mall.Persons.Customer;
import Mall.Persons.Salesperson;
import Mall.Store.Storesystem;

import java.util.List;

public interface MallSystem {
    List<Storesystem> retrieveStores();

    List<Salesperson> retrieveEmployees();

    List<Customer> retrieveCustomers();

    double retrieveProfit();
}
