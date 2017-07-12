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

    public Enemy(EnemyType enemyType) {
        this.enemyType = enemyType;
        health = enemyType.getMaxHits();
        shield = enemyType.getShield();
        attackPower = enemyType.getAttackPower();
    }

    public void attack() {
        if (enemyType == null) {
            System.out.println("The enemy you seek does not exist.");
            return;
        }
        getAttackMessage();
        damage();
    }

    public void getAttackMessage() {
        System.out.println(enemyType.getSymbol() + " has attacked you, causing you " + enemyType.getAttackPower() + " damage points.");
    }

    public void getDefendMessage() {
        System.out.println(enemyType.getSymbol() + " defended your attack, using its shield.");
    }

    public void defend() {
        int sufferedDamage;
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

    public void takeHealth(int hits) {
        this.health -= hits;

        if (health <= 0) {
            isDestroyed();
            health = 0;
            System.out.println(enemyType.getSymbol() + " is dead.");
        }
    }

    public int getHealth() {
        return health;
    }

    @Override
    public int hit(int attackPower) {
        return attackPower;
    }

    @Override
    public boolean isDestroyed() {
        return getHealth() < 1 ? true : false;
    }

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
