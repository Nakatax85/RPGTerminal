package team.rpgterminal.cliente.game.tools;

import team.rpgterminal.cliente.game.items.Item;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.Enemy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 13/07/17.
 */

public class Map {

    private MapZones mapZones;

    private List<Item> items;
    private List<Enemy> enemies;

    private boolean mapBlocker;

    public Map(MapZones mapZones, List<Enemy> enemies, List<Item> items) {
        this.mapZones = mapZones;
        this.items = items;
        this.enemies = enemies;

    }

}
