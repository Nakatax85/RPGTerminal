package team.rpgterminal.cliente.game.nonPlayablesCharacters.villager;

import team.rpgterminal.cliente.game.Destructible;

/**
 * Created by codecadet on 10/07/2017.
 */
public class Villager implements Destructible {


    private int health = 1;
    private int damage = 2;

    /**
     * It returns the current health.
     * @return int - health.
     */
    public int getHealth() {
        return health;
    }


    /**
     * It takes the number of hits from the health and verifies if villager is dead.
     *
     * @param hits - int
     */
    public void takeHealth(int hits) {
        this.health = getHealth() - hits;

        if (health <= 0) {
            isDestroyed();
            health = 0;
            System.out.println("The VILLAGER is dead.");
            causeDamage();
        }
    }

    /**
     * Prints out a damage message and cause the amount of damage on the player.
     * @return int - damage
     */
    public int causeDamage(){
        System.out.println("The death of this VILLAGER causes you "+ damage +" points of damage!");
        return damage;
    }

    /**
     * Mehtod that hits the villager with an amount of attacking power
     * @param attackPower
     * @return int - attackPower
     */
    @Override
    public int hit(int attackPower) {
        takeHealth(attackPower);
        return attackPower;
    }

    /**
     * It returns true all the time. It means the villager is destroyed.
     * @return boolean
     */
    @Override
    public boolean isDestroyed() {
        return true;
    }


}
