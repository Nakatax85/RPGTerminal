package team.rpgterminal.cliente.game.tools;

import team.rpgterminal.cliente.game.items.Item;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.Enemy;

/**
 * Created by codecadet on 13/07/17.
 */
public class Map {

    private MapZones mapZones;
    private Item[] items;
    private Enemy[] enemies;

    private boolean mapBlocker;

    public Map(MapZones mapZones, Item[] items, Enemy[] enemies) {
        this.mapZones = mapZones;
        this.items = items;
        this.enemies = enemies;

    }

}
