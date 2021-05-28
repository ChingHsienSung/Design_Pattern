public abstract class Character {
    private String name;
    WeaponBehavior weapon;

    public Character(String name){
        this.name = name;
    }

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
