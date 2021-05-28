public class King extends Character{

    public King(String name) {
        super(name);
        this.weapon = new SwordBehavior();
    }

    @Override
    public void fight(){
        //System.out.println("King fight!!!");
        this.weapon.useWeapon();
    }
}
