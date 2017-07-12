package team.rpgterminal.cliente.game.playableCharacters;

import team.rpgterminal.cliente.game.Destructible;
import team.rpgterminal.cliente.game.items.Item;

public class Player implements Playable {


    private String name;
    private int health = 100;
    private boolean dead;
    private int level;

    public Player(String name) {
        this.name = name;
        this.dead = false;
        this.level = 1;
    }

    public void listItems() {


    }

    public void useGear(Item item) {


    }

    public void attack(Destructible destructible) {

        if (!destructible.isDestroyed()) {
            try {

                // TODO: FIX: GAME DOES NOT STOP, SIMPLY ATTACK AND BE DONE WITH IT
                System.out.println("You are attacking...");
                Thread.sleep(1000);

                //TODO: Logic to attack here
                System.out.println("attacked");

            } catch (InterruptedException e) {
                System.out.println("Something really bad happened, please try again: " + e);
            }

        } else {
            System.out.println("Enemy is already dead");
        }
    }

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

    public void lookAround() {

        // Comando que retorna lista de objectos a volta

    }

    public void interact() {

        // Recebe lista de lookAround para poder interagir

    }

    // ONLY FOR TEST... AFTER TESTS FUCK IT
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


    // TODO: IT's a multiplayer game if you die you restart you don't close the client!
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
        System.exit(1);
        return true;
    }

    @Override
    public String toString() {
        return "Player information{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", dead=" + dead +
                ", level=" + level +
                '}';
    }

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
