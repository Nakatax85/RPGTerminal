package team.rpgterminal.server.tools;

import team.rpgterminal.cliente.game.items.ItemType;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyType;

import java.util.HashMap;

public class FileParsing {

    public void parse(String file) {

        HashMap<EnemyType, Integer> enemyHashMap = new HashMap<>();
        HashMap<ItemType, Integer> itemHashMap = new HashMap<>();

        String[] phrases;
        String[] splitter;

        EnemyType enemyType;
        ItemType itemType;

        if (file.split(":").equals("") && (file.trim().equals(" "))) {
            return;
        }

        phrases = file.split("\n");

        for (int i = 0; i < phrases.length; i++) {

            splitter = phrases[i].split(":");

            enemyType = transformEnemy(splitter[0]);
            itemType = transformItem(splitter[0]);

            if (enemyType == null) {
                System.out.println("No enemy with that name: " + splitter[0]);

            } else {
                enemyHashMap.put(enemyType, Integer.parseInt(splitter[1]));

            }

            if(itemType == null) {
                System.out.println("No item with that name: " + splitter[0]);
            } else {
                itemHashMap.put(itemType, Integer.parseInt(splitter[1]));
            }

            System.out.println("Enemy HashMap: " + enemyHashMap.toString() + " Item HashMap: " + itemHashMap.toString());

        }

    }

    private EnemyType transformEnemy(String enemySplit) {

        for (EnemyType it : EnemyType.values()) {
            if (it.name().equals(enemySplit)) {
                return it;

            }

        }

        return null;

    }

    private ItemType transformItem(String itemSplit) {

        for (ItemType it : ItemType.values()) {
            if (it.name().equals(itemSplit)) {
                return it;

            }

        }

        return null;

    }

}
