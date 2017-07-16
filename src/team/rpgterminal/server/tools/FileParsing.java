package team.rpgterminal.server.tools;

import team.rpgterminal.cliente.game.items.ItemType;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyType;

import java.util.HashMap;

public class FileParsing {

    HashMap<EnemyType, Integer> enemyHashMap;
    HashMap<ItemType, Integer> itemHashMap;

    public FileParsing() {
        this.enemyHashMap = new HashMap<>();
        this.itemHashMap = new HashMap<>();
    }

    public void parse(String file) {

        String[] phrases;
        String[] splitter;

        EnemyType enemyType;
        ItemType itemType;

        phrases = file.split("\n");

        for (int i = 0; i < phrases.length; i++) {

            splitter = phrases[i].split(":");

            enemyType = transformEnemy(splitter[0]);
            itemType = transformItem(splitter[0]);

            if (enemyType != null) {
                enemyHashMap.put(enemyType, Integer.parseInt(splitter[1]));

            }

            if(itemType != null) {
                itemHashMap.put(itemType, Integer.parseInt(splitter[1]));
            }

        }

        System.out.println("Enemy HashMap: " + enemyHashMap.toString() + " Item HashMap: " + itemHashMap.toString());

    }

    private EnemyType transformEnemy(String enemySplit) {

        for (EnemyType it : EnemyType.values()) {
            if (it.name().equals(enemySplit)) {
                return EnemyType.valueOf(enemySplit);

            }

        }

        return null;

    }

    private ItemType transformItem(String itemSplit) {

        for (ItemType it : ItemType.values()) {
            if (it.name().equals(itemSplit)) {
                return ItemType.valueOf(itemSplit);

            }

        }

        return null;

    }

    public HashMap<EnemyType, Integer> getEnemyHashMap() {
        return enemyHashMap;
    }

    public HashMap<ItemType, Integer> getItemHashMap() {
        return itemHashMap;
    }

}
