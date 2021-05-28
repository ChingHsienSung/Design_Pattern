public class Battle {
    Hero hero1, hero2;
    public Battle(Hero hero1, Hero hero2){
        this.hero1 = hero1;
        this.hero2 = hero2;
    }

    public void start(){
        while (this.hero1.isAlive() && this.hero2.isAlive()){
            this.hero1.attack(this.hero2);

            if (!this.hero2.isAlive()){
                System.out.println(hero1.getName() + "贏了");
                System.out.println(hero2.getName() + "輸了");
                break;
            }

            this.hero2.attack(this.hero1);
            if (!this.hero1.isAlive()){
                System.out.println(hero2.getName() + "贏了");
                System.out.println(hero1.getName() + "輸了");
                break;
            }

        }
    }
}

/*
打架
while(兩個都活著){
    A打B
    B打A
    回合制打架
}

 */
