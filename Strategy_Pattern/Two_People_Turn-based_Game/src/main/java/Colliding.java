public class Colliding implements Skill {

    @Override
    public int attack(Hero attackingHero, Hero attackedHero) {
        int injury = attackingHero.getStrength() - attackedHero.getDefense();
        attackedHero.lostHP(injury);
        return injury;
    }

    @Override
    public String toString(){
        return "水球攻擊";
    }
}
