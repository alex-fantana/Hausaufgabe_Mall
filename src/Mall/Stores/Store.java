package Mall.Stores;

import Mall.MallSystem;
import Mall.Persons.Customer;
import Mall.Persons.Salesperson;
import Mall.Stores.Transaction;

import java.util.*;

public class Store implements MallSystem {

    public Store(String name, int maxCustomers, long id, double profit) {
        this.name = name;
        this.maxCustomers = maxCustomers;
        this.id = id;
        this.profit = profit;
        this.transactions = Collections.<Transaction>emptyList();
        this.customers = Collections.<Customer>emptyList();
        this.Verkaufer = Collections.<Salesperson>emptyList();
    }

    public void update_name(String s) {
        this.name = s;

    }

    public void update_maxC(int x) {
        this.maxCustomers = x;

    }

    public void update_profit(double x) {
        this.profit = x;

    }

    public void delete_Verkaufer(Salesperson x) {
        Verkaufer.remove(x);
    }

    public void delete_Customer(Customer x) {
        customers.remove(x);
    }

    public void delete_Transaction(Transaction x) {
        transactions.remove(x);
    }

    public void addCustomer(Customer x) {
        customers.add(x);
    }

    public void addVerkaufer(Salesperson x) {
        Verkaufer.add(x);
    }

    public void addTransaction(Transaction x) {
        transactions.add(x);
    }

    private String name;
    private int maxCustomers;
    long id;
    private double profit;
    private List<Salesperson> Verkaufer;
    private List<Customer> customers;

    private List<Transaction> transactions;

    public void show() {
        System.out.println(name + " " + id + " " + profit);
        System.out.println("Liste Verkaufer: " + retrieveEmployees());
        System.out.println("Liste Kunde: " + retrieveCustomers());
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

    public List<Salesperson> getVerkaufer() {
        return Verkaufer;
    }

    public void setVerkaufer(List<Salesperson> verkaufer) {
        Verkaufer = verkaufer;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public void setCustomers(List<Customer> cust) {
        customers = cust;
    }

    public void setTransactions(List<Transaction> trans) {
        transactions = trans;
    }

}
