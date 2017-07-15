package team.rpgterminal.cliente.test;

import team.rpgterminal.cliente.game.items.Item;
import team.rpgterminal.cliente.game.items.ItemFactory;
import team.rpgterminal.cliente.game.items.ItemType;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.Enemy;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyFactory;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyType;
import team.rpgterminal.cliente.game.tools.Map;
import team.rpgterminal.cliente.game.tools.MapFactory;
import team.rpgterminal.cliente.game.tools.MapZones;

import java.util.HashMap;

/**
 * Created by codecadet on 13/07/17.
 */
public class TesterMapFactory {

    public static void main(String[] args) {

        EnemyFactory enemyFactory = new EnemyFactory();
        ItemFactory itemFactory = new ItemFactory();

        MapFactory mapFactory = new MapFactory(enemyFactory, itemFactory);

        HashMap<EnemyType, Integer> enemyList = new HashMap<>();
        HashMap<ItemType, Integer> itemList = new HashMap<>();

        enemyList.put(EnemyType.DWARF, 3);
        enemyList.put(EnemyType.ELF, 2);

        itemList.put(ItemType.BASIC_AXE, 2);

        Map map = mapFactory.createMap(MapZones.HOME, enemyList, itemList);

        System.out.println(map.toString());

    }

}
