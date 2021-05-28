public class Main {
    public static void main(String[] args){
        NewspaperOffice newspaperOffice = new NewspaperOffice("飛鴿報");
        System.out.println("=====歡迎來到" + newspaperOffice + "頻道=====");
        IObserver c1 = new Customer("小張");
        IObserver c2 = new Customer("阿京");

        newspaperOffice.registerCustomer(c1);
        newspaperOffice.registerCustomer(c2);

        newspaperOffice.notifyCustomer("最近缺水，請多珍惜水資源!!!");

        newspaperOffice.removeCustomer(c1);
        newspaperOffice.removeCustomer(c2);
        newspaperOffice.registerCustomer(c1);
    }
}
