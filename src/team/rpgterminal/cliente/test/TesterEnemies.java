package team.rpgterminal.cliente.test;


import team.rpgterminal.cliente.game.items.Item;
import team.rpgterminal.cliente.game.items.KindOfItem;
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

        System.out.println("Players initial health: " + player.getHealth());

        enemy.attack(player);

        System.out.println("Players after taking damage: " + player.getHealth());
        System.out.printf("Enemy as attacked for: " + enemy.getAttackPower());

        System.out.println("\nEnemy initial health: " + enemy.getHealth());
        System.out.println("Enemy initial shield: " + enemy.getShield());

        player.attack(enemy);

        System.out.println("Enemy after taking damage: " + enemy.getHealth());
        System.out.println("Enemy after blow in shield: " + enemy.getShield());
        System.out.println("Player has attacked for: " + player.getAttackingPower() + "\n");


        player.addToInventory(new Item("picha", 4, KindOfItem.DEFAULT));
        player.listInventory();

    }
}
