package team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy;

import team.rpgterminal.cliente.game.Destructible;

/**
 * Created by codecadet on 10/07/2017.
 */
public class Enemy implements Destructible {

    private EnemyType enemyType;
    private int shield;
    private int health;
    private int attackPower;

    /**
     * Constructs an Enemy from a specified type.
     * @param enemyType
     */

    public Enemy(EnemyType enemyType) {
        this.enemyType = enemyType;
        health = enemyType.getMaxHits();
        shield = enemyType.getShield();
        attackPower = enemyType.getAttackPower();
    }

    /**
     * It calls the method that prints out an attack message and causes damage to players.
     */
    public void attack() {
        if (enemyType == null) {
            System.out.println("The enemy you seek does not exist.");
            return;
        }
        getAttackMessage();
        damage();
    }

    /**
     * It prints out an attack message from a specific enemy type, with a specific attack power.
     */

    public void getAttackMessage() {
        System.out.println(enemyType.getSymbol() + " has attacked you, causing you " + enemyType.getAttackPower() + " damage points.");
    }

    /**
     * It prints out a defense message.
     */

    public void getDefendMessage() {
        System.out.println(enemyType.getSymbol() + " defended your attack, using its shield.");
    }

    /**
     * It calls the method that prints a defense message and takes health from the enemy.
     * It also verifies if the shield has been destroyed or not and causes damage to the enemy if it is destroyed.
     */
    public void defend() {

        if (!isDestroyed()) {
            shield -= hit(4);
            if (shield > 0) {
                getDefendMessage();
                return;
            }
            takeHealth(Math.abs(shield));
            System.out.println(enemyType.getSymbol() + " has suffered damage. It currently has " + getHealth() + " health points");
        }
    }

    /**
     * It takes health from the enemy and verifies if the enemy has been destroyed.
     * @param hits
     */

    public void takeHealth(int hits) {
        this.health -= hits;

        if (health <= 0) {
            isDestroyed();
            health = 0;
            System.out.println(enemyType.getSymbol() + " is dead.");
        }
    }

    /**
     * It shows the current health the enemy has.
     * @return int health
     */

    public int getHealth() {
        return health;
    }

    /**
     *
     * @param attackPower
     * @return int attackPower
     */
    @Override
    public int hit(int attackPower) {
        return attackPower;
    }

    /**
     * It verifies if enemy is dead.
     * @return boolean
     */
    @Override
    public boolean isDestroyed() {
        return getHealth() < 1 ? true : false;
    }

    /**
     * It causes the amount of damage equal to the specific enemy type attacking power.
     * @return
     */
    public int damage() {
        return enemyType.getAttackPower();
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "enemyType=" + enemyType +
                ", shield=" + shield +
                ", health=" + health +
                ", attackPower=" + attackPower +
                '}';
    }
}
