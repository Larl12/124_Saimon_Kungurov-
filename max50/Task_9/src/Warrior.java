public abstract class Warrior {
    private String name;
    private int attack;
    private int health;

    public Warrior(String name, int attack, int health){
        this.name=name;
        this.attack=attack;
        this.health=health;
    }

    public int getAttack() { return this.attack; }
    public int getHealth() { return this.health; }

    public void setHealth(int health) { this.health = health;}

    public String getName() { return this.name; }

    public void takeDamage(Warrior currWarrior){
        currWarrior.health = currWarrior.health - this.attack;
    }

    public void TakeDamage(Warrior currWarrior){
        currWarrior.health=currWarrior.health-this.attack;
    };
}
