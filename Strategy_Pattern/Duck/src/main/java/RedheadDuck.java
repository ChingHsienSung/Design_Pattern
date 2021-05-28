public class RedheadDuck extends Duck{
    public RedheadDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display(){
        System.out.println("紅頭鴨");
    }
}
