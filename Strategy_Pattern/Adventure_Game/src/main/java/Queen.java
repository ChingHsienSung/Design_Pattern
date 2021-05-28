public class Queen extends Character{

    public Queen(String name){
        super(name);
        this.weapon = new BowAndArrow();
    }

    @Override
    public void fight(){
        //System.out.println("Queen fight!!!");
        this.weapon.useWeapon();
    }
}
