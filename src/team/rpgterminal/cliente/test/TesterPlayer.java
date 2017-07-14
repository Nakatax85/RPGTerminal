package team.rpgterminal.cliente.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import team.rpgterminal.cliente.game.items.Item;
import team.rpgterminal.cliente.game.items.ItemFactory;
import team.rpgterminal.cliente.game.items.ItemType;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.Enemy;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyType;
import team.rpgterminal.cliente.game.playableCharacters.Player;

public class TesterPlayer {

    public static void main(String[] args) {

        Player player = new Player("Mário");
        Enemy enemy = new Enemy(EnemyType.DRAGON);
        ItemFactory itemFactory = new ItemFactory();


        player.move(Player.Directions.EAST);
        System.out.println();
        player.move(Player.Directions.NORTH);
        System.out.println();
        player.move(Player.Directions.SOUTH);
        System.out.println();
        player.move(Player.Directions.WEST);
        System.out.println();

       /* player.addToInventory(itemFactory.createItem(ItemType.BASIC_AXE));
        player.addToInventory(itemFactory.createItem(ItemType.BASIC_SHIELD));
        player.addToInventory(itemFactory.createItem(ItemType.TORCH));
        player.addToInventory(itemFactory.createItem(ItemType.CLOTH));*/

        System.out.println();
        player.listInventory();
        System.out.println();
        player.equipGear(9);
        System.out.println();
        player.equipGear(1);
        System.out.println();
        player.equipGear(0);
        System.out.println();
        player.equipGear(3);
        System.out.println();
        System.out.println(player.toString());

        System.out.println("AQUIIIIIIII");
        player.attack(enemy);
        System.out.println("DEPOISSS");

        player.defend(10288);
    }
}