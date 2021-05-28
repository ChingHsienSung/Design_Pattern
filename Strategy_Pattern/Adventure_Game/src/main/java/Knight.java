public class Knight extends Character{

    public Knight(String name) {
        super(name);
        this.weapon = new KnifeBehavior();
    }

    @Override
    public void fight(){
        //System.out.println("Knight fight!!!");
        this.weapon.useWeapon();
    }
}
