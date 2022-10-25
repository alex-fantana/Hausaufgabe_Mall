package Mall.Stores;

import java.time.LocalDateTime;

public class Transaction {
    private long CustomerId;
    private long SalesPersonId;
    private long StoreId;
    public LocalDateTime data;
    private double sum;


    public Transaction(long customerId, long salesPersonId, long storeId, LocalDateTime data, double sum) {
        CustomerId = customerId;
        SalesPersonId = salesPersonId;
        StoreId = storeId;
        this.data = data;
        this.sum = sum;
    }

    public long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(long customerId) {
        CustomerId = customerId;
    }

    public long getSalesPersonId() {
        return SalesPersonId;
    }

    public void setSalesPersonId(long salesPersonId) {
        SalesPersonId = salesPersonId;
    }

    public long getStoreId() {
        return StoreId;
    }

    public void setStoreId(long storeId) {
        StoreId = storeId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
