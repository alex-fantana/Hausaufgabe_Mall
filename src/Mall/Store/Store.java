package Mall.Store;

import Mall.Persons.Customer;
import Mall.Persons.Salesperson;

import java.util.List;

public class Store extends Storesystem {
    private double profit;
    private List<Salesperson> Verkaufer;
    private List<Customer> customers;

    @Override
    public List<Salesperson> retrieveEmployees() {
        return Verkaufer;
    }

    @Override
    public List<Customer> retrieveCustomers() {
        return customers;
    }

    @Override
    public double retrieveProfit() {
        return this.profit;
    }
}
