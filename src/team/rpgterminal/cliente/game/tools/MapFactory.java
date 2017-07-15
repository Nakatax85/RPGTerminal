package team.rpgterminal.cliente.game.tools;

import team.rpgterminal.cliente.game.items.ItemFactory;
import team.rpgterminal.cliente.game.items.ItemType;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyFactory;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyType;

import java.util.HashMap;

public class MapFactory {

    private ItemFactory itemFactory;
    private EnemyFactory enemyFactory;

    public MapFactory(EnemyFactory enemyFactory, ItemFactory itemFactory) {
        this.enemyFactory = enemyFactory;
        this.itemFactory = itemFactory;
    }

    /**
     * Return a new Map with all the specifications.
     * @param mapZones          A Map Zone.
     * @param enemyHash         A map of Type of Enemies and Quantities.
     * @param itemHash          A map of Type of Items and Quantities
     * @return                  Returns a new Map.
     */
    public Map createMap(MapZones mapZones, HashMap<EnemyType, Integer> enemyHash, HashMap<ItemType, Integer> itemHash) {

        for (HashMap.Entry<EnemyType, Integer> entry : enemyHash.entrySet()) {
            EnemyType enemyType = entry.getKey();
            int value = entry.getValue();

            enemyFactory.createEnemy(enemyType, value);

        }

        for (HashMap.Entry<ItemType, Integer> entry : itemHash.entrySet()) {
            ItemType itemType = entry.getKey();
            int value = entry.getValue();

            itemFactory.createItem(itemType, value);

        }

        return new Map(mapZones, enemyFactory.getEnemyList(), itemFactory.getItemList());

    }

}
