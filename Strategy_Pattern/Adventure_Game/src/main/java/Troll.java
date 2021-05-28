public class Troll extends Character{

    public Troll(String name){
        super(name);
        this.weapon = new AxeBehavior();
    }

    @Override
    public void fight(){
        //System.out.println("Troll fight!!!");
        this.weapon.useWeapon();
    }
}
