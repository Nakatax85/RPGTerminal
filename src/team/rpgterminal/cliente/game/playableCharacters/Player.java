package team.rpgterminal.cliente.game.playableCharacters;

import team.rpgterminal.cliente.game.Destructible;
import team.rpgterminal.cliente.game.MapZones;
import team.rpgterminal.cliente.game.items.Item;
import team.rpgterminal.cliente.game.items.KindOfItem;
import team.rpgterminal.cliente.game.tools.RandomNumber;

import java.util.ArrayList;

public class Player implements Playable {

    /**
     * Player properties
     */
    private ArrayList<Item> inventory;
    private String name;
    private int health = 100;
    private boolean dead;
    private int attackingPower = 1;
    private int causedDamage;
    private int basicDefense = 0;

    public Player(String name) {
        this.name = name;
        this.dead = false;
        inventory = new ArrayList<>();
    }

    /**
     * Player attacks and sets a casedDamage to be accessed by the Game
     *
     * @param destructible
     */
    // TODO: será preciso aqui retonar INT com o valor que o dano causa para facilitar as classes nao terem que conhecer tanto umas das outras????
    public void attack(Destructible destructible) {

        if (!destructible.isDestroyed()) {
            causedDamage = RandomNumber.generate(1, attackingPower);
            System.out.println("You have attacked. Damage taken was: " + causedDamage);
            return;
        } else {
            System.out.println("Enemy is already dead");
        }
    }

    /**
     * Player defends from de attacking power from the Destructibles
     */
    public void defend(int powerToDefend) {

        if (basicDefense >= powerToDefend) {
            basicDefense = basicDefense - powerToDefend;
            System.out.println("You were attacked with " + powerToDefend + " and you defended with success");
            System.out.println("Your basic defense is now " + basicDefense);
            return;
        } else {
            powerToDefend = powerToDefend - basicDefense;
            basicDefense = 0;
            health = health - powerToDefend;
            if (health < 0) {
                health = 0;
            }
            System.out.println("You were attacked with " + powerToDefend + " and your shield can not protect you anymore");
            System.out.println("Your heath points are now " + health);
        }

        if (health <= 0) {
            setDead(true);
            isDead();
            return;
        }
    }

    /**
     * Different places where players can be moved
     *
     * @param direction where player can move
     */
    public void move(Directions direction) {

        switch (direction) {
            case NORTH:
                System.out.println("You moved NORTH");
                break;
            case SOUTH:
                System.out.println("You moved SOUTH");
                break;
            case WEST:
                System.out.println("You moved WEST");
                break;
            case EAST:
                System.out.println("You moved EAST");
                break;
        }
    }

    /**
     * List what is on Player Zone
     */
    public void lookAround(MapZones zone) {
        // Comando que retorna lista de objectos a volta
    }

    /**
     * Interact with Zone
     */
    public void interact() {
        // Recebe lista de lookAround para poder interagir
    }

    /**
     * see Player inventory and gives the player the item index to use it on equipGear() method
     */
    //TODO: verificar prints deste método
    public void listInventory() {

        if (inventory.size() == 0) {
            System.out.println("It looks like that you don't have anything on your inventory to show");
            return;
        }

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i) + ". To equip this item press: EQUIP GEAR + INDEX: " + i);
        }
    }

    /**
     * Interact with Item and set it to use
     *
     * @param index
     */
    public void equipGear(int index) {

        if (index <= inventory.size()) {
            if (inventory.get(index).getItemKind() == KindOfItem.WEAPON) {
                upgradeAttackingPower(index);
                return;
            }

            if (inventory.get(index).getItemKind() == KindOfItem.DEFENSE) {
                upgradeBasicDefense(index);
                return;
            }

            if (inventory.get(index).getItemKind() == KindOfItem.HEALING) {
                upgradeHealthValue(index);
                return;
            }
            System.out.println("Its not possible to use " + inventory.get(index).toString());
            return;
        }
        System.out.println("Not a valid gear to wear");
    }

    /**
     * Updates player basicDefense value
     *
     * @param index ArrayList index value
     */
    private void upgradeBasicDefense(int index) {
        basicDefense = basicDefense + inventory.get(index).getBonus();
        System.out.println(inventory.get(index).toString() + " is equiped");
        System.out.println("Your basic defense is now " + basicDefense);
    }

    /**
     * Updates player attacking power value
     *
     * @param index ArrayList index value
     */
    private void upgradeAttackingPower(int index) {
        attackingPower = attackingPower + inventory.get(index).getBonus();
        System.out.println(inventory.get(index).toString() + " is equiped");
        System.out.println("Your power attack is now up to " + attackingPower + " Health Points");
    }

    /**
     * Updates player health value
     *
     * @param index ArrayList index value
     */
    private void upgradeHealthValue(int index) {
        health = health + inventory.get(index).getBonus();
        System.out.println("You have been healed");
        System.out.println("Your health is now " + health);
    }

    /**
     * Adds an item to the player inventory
     *
     * @param item
     */
    public void addToInventory(Item item) {
        inventory.add(item);
        System.out.println("Added: " + item + " to your inventory");
    }

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

    /**
     * reset player stats and inventory when player is dead
     */
    private void resetPlayer() {
        setHealth(100);
        setDead(false);
        inventory.clear();

        System.out.println("It looks like someone revive you, but unfortunately you lost all your gear and stats... " +
                "Are you up for the challenge once again?");
    }

    /**
     * When player is dead, set it to true
     *
     * @param dead
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    /**
     * @return players properties
     */
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attacking power: " + attackingPower +
                ", basic defense: " + basicDefense +
                ", inventory: " + inventory +
                '}';
    }

    /**
     * What directions are available for players to take
     */
    public enum Directions {
        NORTH,
        SOUTH,
        WEST,
        EAST
    }
}
