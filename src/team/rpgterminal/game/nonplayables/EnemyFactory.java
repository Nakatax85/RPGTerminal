package team.rpgterminal.game.nonplayables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 11/07/2017.
 */
public class EnemyFactory {

    private List<Enemy> enemyList = new ArrayList<>();

    public void createEnemy(){
        for (int i = 0; i < 5 ; i++) {
            enemyList.add(new Enemy(EnemyType.DWARF));
        }
    }
}
