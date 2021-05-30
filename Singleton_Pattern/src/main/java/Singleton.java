// Method1: Singleton原型版，在使用多執行緒的時候會遇到同步化的問題，
// 也就是在第一次用getInstance()的時候可能會有多個執行緒同時判斷uniqueInstance==null，而造成獨體模式會被多個執行緒同時使用。

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return  uniqueInstance;
    }
}


/*
// Method2:處理多執行緒可加入synchronized來避免兩個thread同時在第一次一起載入Singleton，但一直同步化會很消耗效能。
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return  uniqueInstance;
    }
}
*/

/*
// Method3:使用率先建立實體，而不用拖延實體化的做法
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        return  uniqueInstance;
    }
}
*/

/*
// Method4:使用雙重上鎖，在getInstance()中減少同步化
public class Singleton {
    private volatile static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        System.out.println("hello");
        // 檢查實體，如果不存在，就進入同步化區塊
        if (uniqueInstance == null){
            //================= 只有第一次才徹底執行這裡的程式碼 =================
            synchronized (Singleton.class) {
                // 進入區塊後，再檢查一次，如果仍是null，才建立實體
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
            //================= 只有第一次才徹底執行這裡的程式碼 =================
        }
        return uniqueInstance;
    }
}
*/

// synchronized(this)
// 此種synchronized用法鎖定的物件為Method所屬的物件的Class，
// 不管被new出幾個的Instance，都能夠保證同一個時間只會有一個Thread在執行此Method。