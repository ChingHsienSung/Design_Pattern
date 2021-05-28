/*
 * 豆漿
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    public double cost(){
        return 0.15 + this.beverage.cost();
    }
}
