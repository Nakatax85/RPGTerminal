package team.rpgterminal.cliente.game.tools;

import team.rpgterminal.cliente.game.items.Item;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.Enemy;

import java.util.List;

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

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public List<Item> getItems() {
        return items;
    }

    public MapZones getMapZones() {
        return mapZones;
    }

    public boolean getMapBlocker() {
        return mapBlocker;
    }

    public void setMapBlocker(boolean mapBlocker) {
        this.mapBlocker = mapBlocker;
    }

    @Override
    public String toString() {
        return "Map{" +
                "mapZones=" + mapZones +
                ", items=" + items +
                ", enemies=" + enemies +
                ", mapBlocker=" + mapBlocker +
                '}';
    }

}
