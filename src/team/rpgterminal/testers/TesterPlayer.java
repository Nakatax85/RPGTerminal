package team.rpgterminal.testers;

import team.rpgterminal.game.nonplayables.Enemy;
import team.rpgterminal.game.playables.Player;

public class TesterPlayer {

    public static void main(String[] args) {

        Player player = new Player("Mário");
        Enemy enemy = new Enemy();

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
