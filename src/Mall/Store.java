package Mall;

import Mall.Persons.Customer;
import Mall.Persons.Salesperson;

import java.util.List;

public class Store implements MallSystem {

    public Store(String name, int maxCustomers, long id, double profit) {
        this.name = name;
        this.maxCustomers = maxCustomers;
        this.id = id;
        this.profit = profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    private String name;
    private int maxCustomers;
    long id;
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
    public List<Store> retrieveStores() {
        return null;
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
