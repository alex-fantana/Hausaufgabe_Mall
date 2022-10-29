package Mall.Persons;

import Mall.MallSystem;
import Mall.Stores.Store;

import java.util.List;

public class Customer extends Person implements MallSystem {
    public List<Store> stores;
    private double credit;

    public Customer(String name, String vorname, long id, List<Store> stores, double credit) {
        super(name, vorname, id);
        this.stores = stores;
        this.credit = credit;
    }
    //ToDo
    public void update_stores(List<Store> s){

    }
    public void update_credit(double x){

    }
    @Override
    public double retrieveProfit() {
        return this.credit;
    }

}
