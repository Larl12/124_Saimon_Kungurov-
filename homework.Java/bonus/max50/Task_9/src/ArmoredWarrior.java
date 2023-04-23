public class ArmoredWarrior extends Warrior {
    private int armor;


    public ArmoredWarrior(String name, int attack , int health , int armor){
        super(name,attack,health);
        this.armor=armor;

    }
    public int getArmor() {return this.armor;}

    @Override
    public void TakeDamage(Warrior currWarrior){
        int curHealth;
        curHealth=currWarrior.getHealth()-this.armor;
        if(curHealth <= 1){
            curHealth = 1;
        }
        currWarrior.setHealth(curHealth);
    }
}

