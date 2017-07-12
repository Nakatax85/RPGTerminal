package team.rpgterminal.cliente.game.playableCharacters;

import team.rpgterminal.cliente.game.Destructible;
import team.rpgterminal.cliente.game.items.Item;
import team.rpgterminal.cliente.game.tools.RandomNumber;

public class Player implements Playable {

    // TODO: List of itens that are loaded
    // TODO: List of gear that is being used
    private String name;
    private int health = 100;
    private boolean dead;
    private int playerDamage = 5;
    private int causedDamage;
    private int basicDefense;

    public Player(String name) {
        this.name = name;
        this.dead = false;
    }

    /**
     *
     * Player attacks and sets a casedDamage to be accessed by the Game
     *
     * @param destructible
     */
    public void attack(Destructible destructible) {

        if (!destructible.isDestroyed()) {

            causedDamage = RandomNumber.generate(1, playerDamage);
            System.out.println("You have attacked. Damage taken was: " + causedDamage);

        } else {
            System.out.println("Enemy is already dead");
        }
    }

    /**
     *
     * Player defend method from Destructible
     *
     */
    public void defend() {

        if (getHealth() <= 0) {
            isDead();
            return;
        }
        System.out.println("Defending...");
    }

    /**
     * Different places where players can be moved
     *
     * @param direction where player can move
     */
    public void move(Directions direction) {

        switch (direction) {
            case FORWARD:
                System.out.println("Player moved FORWARD\n");
                break;
            case BACK:
                System.out.println("Player moved BACK\n");
                break;
            case LEFT:
                System.out.println("Player moved LEFT\n");
                break;
            case RIGHT:
                System.out.println("Player moved RIGHT\n");
                break;
        }
    }

    /**
     * List what is on Player Zone
     */
    public void lookAround() {

        // Comando que retorna lista de objectos a volta

    }

    /**
     * Interact with Zone
     */
    public void interact() {

        // Recebe lista de lookAround para poder interagir

    }

    /**
     * see Player inventory
     */
    public void listItems() { }

    /**
     * Interact with Item and set it to use
     * @param item
     */
    public void useGear(Item item) { }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getInstruction(String instructions) {
        return null;
    }

    /**
     * @return if player is dead or not
     */
    @Override
    public boolean isDead() {

        if (getHealth() > 0) {
            System.out.println("You have " + getHealth() + " health points");
            return false;
        }
        System.out.println("You are dead! GAME OVER!");
        resetPlayer();
        return true;
    }

    private void resetPlayer() {
        setHealth(100);
        setDead(false);
    }

    /**
     * When player is dead, set it to true
     *
     * @param dead
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }


    @Override
    public String toString() {
        return "Player information{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", dead=" + dead +
                '}';
    }

    /**
     *
     * What directions are available for players to take
     *
     */
    public enum Directions {
        FORWARD("forward"),
        BACK("back"),
        LEFT("left"),
        RIGHT("right");

        private String move;

        Directions(String move) {
            this.move = move;
        }
    }
}
