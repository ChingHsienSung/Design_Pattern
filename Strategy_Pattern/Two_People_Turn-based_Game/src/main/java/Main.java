public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("阿憲", new OnePunch());
        Hero hero2 = new Hero("阿宋", new Colliding());

        Battle battle = new Battle(hero1, hero2);
        battle.start();
    }
}
