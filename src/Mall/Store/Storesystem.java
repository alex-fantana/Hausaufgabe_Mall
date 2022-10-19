package Mall.Store;

import Mall.MallSystem;
import Mall.Persons.Customer;
import Mall.Persons.Salesperson;

import java.util.List;

public abstract class Storesystem implements MallSystem {
    public String name;
    public int maxCustomers;
    public long id;
    private List<Store> stores;

    public void addStore(Store x) {
        stores.add(x);
    }

    @Override
    public List<Storesystem> retrieveStores() {
        return null;
    }

    @Override
    public double retrieveProfit() {
        double s = 0;
        for (Store i : stores)
            s += i.retrieveProfit();
        return s;
    }
}
