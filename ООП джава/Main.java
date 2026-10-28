public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Dragon", 100, 20);
        Hero hero2 = new Hero("King", 50, 10);
        Warrior warrior = new Warrior("Achilles", 70, 10, "Warrior");
        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(warrior);
        warrior.fight(hero2);
    }
}

