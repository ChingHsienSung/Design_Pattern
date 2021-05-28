public class Customer implements IObserver{
    private String name;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public void update(String content){
        System.out.println(this.name + "收到" + content);
    }

    // 方便印出自定義的內容(Default為印出物件名稱)。
    @Override
    public String toString() {
        return this.name;
    }
}
