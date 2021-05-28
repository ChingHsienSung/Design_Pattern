import java.util.ArrayList;

public class NewspaperOffice implements ISubject{
    private String name;
    private ArrayList customers;

    public NewspaperOffice(String name){
        this.customers = new ArrayList();
        this.name = name;
    }

    @Override
    public void registerCustomer(IObserver customer) {
        this.customers.add(customer);
        System.out.println(customer + "訂閱成功");
    }

    @Override
    public void removeCustomer(IObserver customer) {
        int i = customers.indexOf(customer);
        if (i >= 0) {
            this.customers.remove(i);
        }
        System.out.println(customer + "退訂成功");
    }

    @Override
    public void notifyCustomer(String content) {
        for (int i = 0; i < this.customers.size(); i++){
            Customer customer = (Customer) this.customers.get(i);
            customer.update(content);
        }
    }

    // 方便印出自定義的內容(Default為印出物件名稱)。
    @Override
    public String toString() {
        return this.name;
    }
}
