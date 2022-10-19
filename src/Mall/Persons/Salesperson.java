package Mall.Persons;

import Mall.MallSystem;
import Mall.Store.Store;

public class Salesperson extends Person implements MallSystem {
    public Store store;
    public long id;

    public Salesperson(String name, String vorname, Store store, long id) {
        super(name, vorname);
        this.store = store;
        this.id = id;
    }


    @Override
    public double retrieveProfit() {
        return store.retrieveProfit();
    }
}
