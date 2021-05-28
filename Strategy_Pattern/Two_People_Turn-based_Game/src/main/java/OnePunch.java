public class OnePunch implements Skill{
    @Override
    public int attack(Hero attackingHero, Hero attackedHero) {
        int injury = 10000;
        attackedHero.lostHP(injury);
        return injury;
    }

    @Override
    public String toString(){
        return "一拳攻擊";
    }
}
