package team.rpgterminal.cliente.game.tools;

import team.rpgterminal.cliente.game.items.ItemFactory;
import team.rpgterminal.cliente.game.items.ItemType;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyFactory;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyType;

import java.util.HashMap;

public class MapFactory {

    private ItemFactory itemFactory;
    private EnemyFactory enemyFactory;

    public MapFactory() {
        this.enemyFactory = new EnemyFactory();
        this.itemFactory = new ItemFactory();
    }

    public Map createMap(MapZones mapZones, HashMap<EnemyType, Integer> enemyHash, HashMap<ItemType, Integer> itemHash) {

        int iterator = 0;

        while (enemyHash.size() < iterator) {
            enemyHash.g
            enemyFactory.createEnemy();

            iterator++;

        }


        itemFactory.createItem();

        return new Map(mapZones, enemyHash, itemHash);

    }

}
