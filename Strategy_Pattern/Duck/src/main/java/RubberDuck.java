public class RubberDuck extends Duck{
    public RubberDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display(){
        System.out.println("塑膠鴨");
    }
}
