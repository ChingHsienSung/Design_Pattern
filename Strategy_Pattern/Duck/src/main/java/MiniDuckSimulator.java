public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        System.out.println("============================");

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        QuackBehavior duckCall = new DuckCall();
        duckCall.quack();
    }
}
