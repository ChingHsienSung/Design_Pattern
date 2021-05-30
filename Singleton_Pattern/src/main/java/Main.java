public class Main {
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(Singleton.class);

        // 用hashCode()來判斷兩個Singleton物件是否為同一個
        System.out.println("s1:" + s1.hashCode());
        System.out.println("s2:" + s2.hashCode());
    }
}
// static 關鍵字功能: 1.不用去new一個物件，就可以透過class直接存取該變數
//                  2.具唯一的概念，永遠站著那一組記憶體空間，不管被new幾個物件，其值不變