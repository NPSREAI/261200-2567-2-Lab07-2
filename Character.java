public class Character {
    private int health;
    private int stamina;
    private final int maxHealth;
    private final int maxStamina;

    // getters for health and stamina
    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    // Constructor
    public Character(int maxHealth, int maxStamina) {
        this.maxHealth = maxHealth;
        this.maxStamina = maxStamina;
        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    // Methode swingSword
    public void swingSword() {
        if (stamina >= 10) {
            stamina -= 10;
            System.out.println("Character swings sword. Stamina is now " + stamina + ".");
        } else {
            stamina = 0;
            System.out.println("Your character needs to cool down.");
        }
    }

    // Method takeDamage
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            System.out.println("Character takes " + damage + " damage. Health is now 0.");
            System.out.println("Character is dead.");
        } else {
            System.out.println("Character takes " + damage + " damage. Health is now " + health + ".");
        }
    }

    // Method rest
    public void rest() {
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}


