public class Hero {

    private String name;
    private int health;
    private int power;

    public Hero(String name, int health, int power) {
        this.name = name;
        this. health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public  String toString() {
        return "Hero: " + name + " | Health: " + health + " | Power: " + power;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if(this.health < 0)
            this.health = 0;
        System.out.print(" | У " + name +" осталось " + health + " HP." + "\n");
    }

    public void attack(Hero target) {
        System.out.print(this.name + " атаковал " + target.name + " на " + this.power + " единиц урона.");
        target.takeDamage(this.power);
    }

    public void fight(Hero opponent) {
        System.out.println("____________________________________");
        while(this.health > 0 && opponent.health > 0) {
            this.attack(opponent);
            if (opponent.health > 0) {
                opponent.attack(this);
            }
        }
        if (this.health > 0) {
            System.out.println("____________________________________");
            System.out.println(this.name + " Победил!");
        } else {
            System.out.println("____________________________________");
            System.out.println(opponent.name + " Победил!");
        }
    }
}