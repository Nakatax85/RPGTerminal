package team.rpgterminal.cliente.test;

import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.Enemy;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyType;
import team.rpgterminal.cliente.game.playableCharacters.Player;

public class TesterPlayer {

    public static void main(String[] args) {

        Player player = new Player("Mário");
        Enemy enemy = new Enemy(EnemyType.DRAGON);

        System.out.println(player.toString());
        System.out.println();

        System.out.printf("My name is " + player.getName() + "\n");

        player.move(Player.Directions.BACK);
        player.move(Player.Directions.FORWARD);
        player.move(Player.Directions.LEFT);
        player.move(Player.Directions.RIGHT);

        player.setHealth(20);

        player.isDead();

        player.setHealth(0);

        player.isDead();

        player.defend();

        player.setHealth(1);

        player.defend();

        player.attack(enemy);
    }
}
