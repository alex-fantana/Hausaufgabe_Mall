package Mall.Stores;

import Mall.MallSystem;
import Mall.Persons.Customer;
import Mall.Persons.Salesperson;
import Mall.Stores.Transaction;
import java.util.List;

public class Store implements MallSystem {

    public Store(String name, int maxCustomers, long id, double profit) {
        this.name = name;
        this.maxCustomers = maxCustomers;
        this.id = id;
        this.profit = profit;
    }
    //ToDo
    public void update_name(String s){

    }
    public void update_maxC(int x){

    }
    public void update_profit(double x){

    }
    public void delete_Verkaufer(Salesperson x){

    }
    public void delete_Customer(Customer x){

    }
    public void delete_Transaction(Transaction x){

    }
    public void addCustomer(Customer x) {
    }

    public void addVerkaufer(Salesperson x) {

    }
    public void addTransaction(Transaction x){

    }
    private String name;
    private int maxCustomers;
    long id;
    private double profit;
    private List<Salesperson> Verkaufer;
    private List<Customer> customers;

    private List<Transaction> transactions;

    public void show(){
        System.out.println(name+" "+ id+" "+profit);
        System.out.println("Liste Verkaufer: "+retrieveEmployees());
        System.out.println("Liste Kunde: "+retrieveCustomers());
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

}
