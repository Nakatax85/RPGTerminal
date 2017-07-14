package team.rpgterminal.cliente.game.tools;

import team.rpgterminal.cliente.game.items.Item;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.Enemy;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyFactory;

public class MapFactory {

    private Item[] items;
    private EnemyFactory enemyFactory;

    public MapFactory() {
        this.enemyFactory = new EnemyFactory();
    }

    public Map createMap(MapZones mapZones) {

        switch (mapZones) {

            case HOME:
                return new Map(mapZones, items, populateEnemy(4));

            case FOREST:
                return new Map(mapZones, items, populateEnemy(5));

            case TREE_OF_LIFE:
                return new Map(mapZones, items, populateEnemy(0));

            case RIVER_FLOW:
                return new Map(mapZones, items, populateEnemy(3));

            case CATARACT_FALLS:
                return new Map(mapZones, items, populateEnemy(3));

            case MOUNTAIN:
                return new Map(mapZones, items, populateEnemy(4));

            case SNOW_FALL:
                return new Map(mapZones, items, populateEnemy(7));

            case ICY_PEAK:
                return new Map(mapZones, items, populateEnemy(5));

            case MOUNT_NEVERLAST:
                return new Map(mapZones, items, populateEnemy(3));

            case PLAIN:
                return new Map(mapZones, items, populateEnemy(9));

            case CLIFF_EASTWOOD:
                return new Map(mapZones, items, populateEnemy(5));

            case ELEPHANT_CEMETERY:
                return new Map(mapZones, items, populateEnemy(6));

            case DEATH_END:
                return new Map(mapZones, items, populateEnemy(10));

            case VOLCANO_HOLE:
                return new Map(mapZones, items, populateEnemy(2));

            case THE_FORGE:
                return new Map(mapZones, items, populateEnemy(5));

            case CASTLE_OF_FLAMES:
                return new Map(mapZones, items, populateEnemy(4));

        }

        return null;

    }

    private Enemy[] populateEnemy(int numberOfEnemies) {

        Enemy[] enemies = new Enemy[numberOfEnemies];

        for (int i = 0; i < enemies.length; i++) {
            // TODO: THINK ABOUT SOMETHING DIFERENT
            enemies[i] = enemyFactory.createDragon();
        }

        return enemies;

    }

}
