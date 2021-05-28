public class Main {
    public static void main(String[] args){
        Character Aaron = new Knight("Aaron");
        System.out.print(Aaron.getName() + "'s default weapon is ");
        Aaron.fight();

        Aaron.setWeapon(new BowAndArrow());
        System.out.print(Aaron.getName() + "'s reset weapon is ");
        Aaron.fight();

    }
}
