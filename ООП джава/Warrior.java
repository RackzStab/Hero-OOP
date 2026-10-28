public class Warrior extends Hero {

    private String heroClass;

    public Warrior(String name, int health, int power) {
        super(name, health, power);
    }

    public Warrior(String name, int health, int power, String heroClass) {
        super(name, health, power);
        this.heroClass = heroClass;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    @Override
    public void attack(Hero target) {   
        int critDamage = getPower() * 2;
        System.out.print("Воин " + getName() + " нанес критичесий удар по " + target.getName() + ", нанеся " + critDamage + " единиц урона.");
        target.takeDamage(critDamage);
    }

    @Override 
    public  String toString() {
        return "Hero: " + getName() + " | Health: " + getHealth() + " | Power: " + getPower() + " | Class: " + heroClass;
    }
}
