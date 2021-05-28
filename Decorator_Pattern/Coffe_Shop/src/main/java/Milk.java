/*
 * 牛奶
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    public double cost(){
        return 0.10 + this.beverage.cost();
    }
}
