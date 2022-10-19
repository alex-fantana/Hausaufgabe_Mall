package Mall.Persons;

import Mall.MallSystem;
import Mall.Store.Storesystem;

import java.util.List;

public class Customer extends Person implements MallSystem {
    public List<Storesystem> stores;
    private double credit;
    public long id;

    @Override
    public double retrieveProfit() {
        return this.credit;
    }

}
