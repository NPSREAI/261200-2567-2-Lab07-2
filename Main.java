public class Main {
    public static void main(String[] args) {
        // Create a character instance
        Character hero = new Character(100, 50);

        // Call swingSword
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();
        hero.swingSword(); // Should trigger "Your character needs to cool down."

        // Call takeDamage
        hero.takeDamage(30);
        hero.takeDamage(50);
        hero.takeDamage(20); // Should trigger "Character is dead."

        // Call rest
        hero.rest();

        // Print state
        System.out.println("Character's health: " + hero.getHealth() + ", stamina: " + hero.getStamina() + ".");
    }
}