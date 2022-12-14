package net.honey;
@SuppressWarnings("unused")
public class CardPOJO {
    // initialise base variables
    private final int id;
    private final String name;
    private final int baseHealth;
    private final int baseAttack;
    private final AttackType attackType;
    private final String imageLink;
    private final String description;
    private int runningHealth;
    private int runningAttack;


    // Constructor
    public CardPOJO(int id, String name, int baseHealth, int baseAttack,
                    AttackType attackType, String imageLink, String description) {
        this.id = id;
        this.name = name;
        this.baseHealth = baseHealth;
        this.baseAttack = baseAttack;
        this.attackType = attackType;
        this.imageLink = imageLink;
        this.description = description;

        this.runningHealth = baseHealth;
        this.runningAttack = baseAttack;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBaseAttack() {
        return baseAttack;
    }
    public int getBaseHealth() {
        return baseHealth;
    }
    public AttackType getAttackType() {
        return attackType;
    }
    public String getImageLink() {
        return imageLink;
    }
    public String getDescription() {
        return description;
    }
    public int getRunningAttack() {
        return runningAttack;
    }
    public int getRunningHealth() {
        return runningHealth;
    }
    // Setters
    public void setRunningAttack(int runningAttack) {
        this.runningAttack = runningAttack;
    }
    public void setRunningHealth(int runningHealth) {
        this.runningHealth = runningHealth;
    }
}
