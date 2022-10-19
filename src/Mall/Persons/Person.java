package Mall.Persons;

import Mall.MallSystem;
import Mall.Store.Storesystem;

import java.util.List;

public abstract class Person implements MallSystem {
    private String name;
    private String vorname;

    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    @Override
    public List<Storesystem> retrieveStores() {
        return null;
    }

    @Override
    public double retrieveProfit() {
        return 0;
    }

    @Override
    public List<Salesperson> retrieveEmployees() {
        return null;
    }

    @Override
    public List<Customer> retrieveCustomers() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}
