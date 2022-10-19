package Mall.Store;

import Mall.Persons.Customer;
import Mall.Persons.Salesperson;

import java.util.List;

public class Store extends Storesystem {
    public Store(String name, int maxCustomers, long id, double profit) {
        super(name, maxCustomers, id);
        this.profit = profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    private double profit;
    private List<Salesperson> Verkaufer;
    private List<Customer> customers;

    public void addCustomer(Customer x) {
        customers.add(x);
    }

    public void addVerkaufer(Salesperson x) {
        Verkaufer.add(x);
    }

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
