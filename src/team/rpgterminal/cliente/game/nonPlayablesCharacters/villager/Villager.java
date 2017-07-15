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
     * It creates a greeting.
     */
    public void villagerNormalGreeting(){
        System.out.println("Hello kind one. I'm just a poor VILLAGER trying to survive out here.");
    }

    /**
     * It creates a greeting.
     */
    public void villagerBraveGreeting(){
        System.out.println("Hi there warrior. I don't know how can I help you, but you better move on or else...");
    }

    /**
     * It creates a greeting.
     */
    public void villagerJokerGreeting(){
        System.out.println("Are you talking to me??? I'm the VILLAGER who fcuked your mom! Just joking.");
    }

    /**
     * It creates a villager reply.
     */
    public void villagerNormalReply(){
        System.out.println("I wish I knew the answer to that question. I'm sorry I can't help you.");
    }

    /**
     * It creates a villager reply.
     */
    public void villagerBraveReply(){
        System.out.println("Maybe I could help you, but I'm afraid I'm just too busy to deal with you right now.");
    }

    /**
     * It creates a villager reply.
     */
    public void villagerJokerReply(){
        System.out.println("Bananas....");
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
     * @param playerAttackPower
     * @return int - attackPower
     */
    @Override
    public void takeHit(int playerAttackPower) {
        if (health <= 0) {
            return;
        }

        health -= playerAttackPower;
    }

    /**
     * Is the villager dead?
     * @return boolean
     */
    @Override
    public boolean isDestroyed() {
        return health <= 0;
    }


}
