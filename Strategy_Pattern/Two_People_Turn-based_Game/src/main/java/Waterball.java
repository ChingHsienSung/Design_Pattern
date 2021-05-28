public class Waterball implements Skill {

    @Override
    public int attack(Hero attackingHero, Hero attackedHero) {
        int injury = attackingHero.getWisdom() * 2;
        attackingHero.lostMP(5);
        attackedHero.lostHP(injury);
        return injury;
    }

    @Override
    public String toString(){
        return "水球攻擊";
    }
}
