package team.rpgterminal.cliente.test;


import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.Enemy;

import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyFactory;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyType;

/**
 * Created by codecadet on 10/07/2017.
 */
public class TesterEnemies {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(EnemyType.DWARF);
        Enemy enemy1 = new Enemy(EnemyType.MERCENARY);
        EnemyFactory enemyFactory = new EnemyFactory();


        System.out.println("TESTING ENEMY ATTACKS");
        for (int i = 0; i < 5; i++) {
            enemy.attack();
            enemy1.attack();

        }

        System.out.println();
        System.out.println("TESTING ENEMY DEFENDS");
        for (int i = 0; i < 3; i++) {
            enemy.defend();
            enemy1.defend();
        }

        System.out.println();

        System.out.println("TESTING ENEMY FACTORY");

        for (int i = 0; i < 7; i++) {
            enemyFactory.createEnemy();
        }
    }
}
