/*
 * 摩卡
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){        // 傳入Beverage 物件來使用。
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return 0.20 + this.beverage.cost();
    }
}
