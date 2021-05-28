/*
 * 奶泡
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    public double cost(){
        return 0.10 + this.beverage.cost();
    }
}
