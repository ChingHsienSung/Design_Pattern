public class Hero{
    private String name;
    private int hp = 500;
    private int mp = 200;
    private int strength = 150;
    private int wisdom = 30;
    private int defense = 50;
    private Skill skill;

    public Hero(String name, Skill skill){
        this.name = name;
        this.skill = skill;
    }

    public void attack(Hero targetHero){
        int injury = this.skill.attack(this, targetHero);
        System.out.printf("%s 使用了 %s，傷害為 %d \n", this.getName(), skill, injury);
        System.out.printf("%s 的血量剩下 %d \n", targetHero.getName(), targetHero.getHP());
    }

    public boolean isAlive(){
        return this.hp > 0;
    }

    public String getName(){
        return this.name;
    }

    public int getHP(){
        return Math.max(this.hp, 0);
    }

    public int getMP(){
        return this.mp;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getWisdom(){
        return this.wisdom;
    }

    public int getDefense(){
        return this.defense;
    }

    public void lostHP(int injury){
        this.hp = this.hp - injury;
    }

    public void lostMP(int lostValue){
        this.mp = this.mp - lostValue;
    }

}