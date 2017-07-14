package team.rpgterminal.cliente.game.tools;

import team.rpgterminal.cliente.game.items.Item;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.Enemy;

import java.util.ArrayList;

/**
 * Created by codecadet on 13/07/17.
 */

public class Map {

    private MapZones mapZones;

    private boolean mapBlocker;

    public Map(MapZones mapZones, ArrayList<Item> items, ArrayList<Enemy> enemies) {
        this.mapZones = mapZones;
        this.items = items;
        this.enemies = enemies;

    }

}
