package team.rpgterminal.cliente.test;


import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.Enemy;

import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyFactory;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyType;
import team.rpgterminal.cliente.game.playableCharacters.Player;

/**
 * Created by codecadet on 10/07/2017.
 */
public class TesterEnemies {
    public static void main(String[] args) {

        Enemy enemy = new Enemy(EnemyType.ELF, 5, 5, 10);
        Player player = new Player("Chico");

        System.out.println("TESTING ENEMY ATTACKS");

        enemy.attack();
        System.out.printf("Enemy as attacked for: " + enemy.getAttackPower());

    }
}
