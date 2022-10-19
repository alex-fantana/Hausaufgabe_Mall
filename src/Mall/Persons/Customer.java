package Mall.Persons;

import Mall.MallSystem;
import Mall.Store.Storesystem;

import java.util.List;

public class Customer extends Person implements MallSystem {
    public List<Storesystem> stores;
    private double credit;
    public long id;

    public Customer(String name, String vorname, List<Storesystem> stores, double credit, long id) {
        super(name, vorname);
        this.stores = stores;
        this.credit = credit;
        this.id = id;
    }


    @Override
    public double retrieveProfit() {
        return this.credit;
    }

}
