package Mall.Persons;

import Mall.MallSystem;
import Mall.Stores.Store;

public class Salesperson extends Person implements MallSystem {
    public Store store;

    public Salesperson(String name, String vorname, long id, Store store) {
        super(name, vorname, id);
        this.store = store;
    }


    @Override
    public double retrieveProfit() {
        return store.retrieveProfit();
    }
}
