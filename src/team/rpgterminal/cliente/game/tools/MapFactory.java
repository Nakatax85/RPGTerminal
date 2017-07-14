package team.rpgterminal.cliente.game.tools;

import team.rpgterminal.cliente.game.items.Item;
import team.rpgterminal.cliente.game.items.ItemFactory;
import team.rpgterminal.cliente.game.items.ItemType;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.Enemy;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyFactory;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapFactory {

    private ItemFactory itemFactory;
    private EnemyFactory enemyFactory;

    private List<Enemy> enemyList = new ArrayList<>();
    private List<Item> itemList = new ArrayList<>();

    public MapFactory() {
        this.enemyFactory = new EnemyFactory();
        this.itemFactory = new ItemFactory();
    }

    public Map createMap(MapZones mapZones, HashMap<EnemyType, Integer> enemyHash, HashMap<ItemType, Integer> itemHash) {

        for (HashMap.Entry<EnemyType, Integer> entry : enemyHash.entrySet()) {
            EnemyType enemyType = entry.getKey();
            int value = entry.getValue();
            System.out.println(value);

            for (int i = 0; i < value; i++) {
                enemyList.add(enemyFactory.createEnemy(enemyType));
            }

        }

        //System.out.println(enemyList.size());

        for (HashMap.Entry<ItemType, Integer> entry : itemHash.entrySet()) {
            ItemType itemType = entry.getKey();
            int value = entry.getValue();

            for (int i = 0; i < value; i++) {
                itemList.add(itemFactory.createItem(itemType));
            }

        }

        //System.out.println(itemList.size());

        return new Map(mapZones, enemyList, itemList);

    }

    @Override
    public String toString() {
        return "MapFactory{" +
                "itemFactory=" + itemFactory +
                ", enemyFactory=" + enemyFactory +
                ", enemyList=" + enemyList +
                ", itemList=" + itemList +
                '}';
    }

}
