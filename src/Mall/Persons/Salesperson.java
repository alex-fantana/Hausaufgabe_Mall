package Mall.Persons;

import Mall.MallSystem;
import Mall.Store.Store;

public class Salesperson extends Person implements MallSystem {
    public Store store;
    public long id;

    @Override
    public double retrieveProfit() {
        return store.retrieveProfit();
    }
}
