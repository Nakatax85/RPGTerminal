package team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy;

import team.rpgterminal.cliente.game.tools.RandomNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 11/07/2017.
 */
public class EnemyFactory {

    // TODO: FACTORY RETURNS ONE ENEMY, DOES NOT NEED TO HAVE A LIST
    private List<Enemy> enemyList = new ArrayList<>();
    private int randomNumber = RandomNumber.generate(0, 4);
    private Enemy enemy;

    public Enemy createEnemy() {
        EnemyType enemyType;


        switch (randomNumber) {
            case 0:
                enemyType = EnemyType.MONSTER;
                enemyList.add(new Enemy(enemyType));
                enemy = enemyList.get(enemyList.lastIndexOf(enemyType));
                System.out.println("A "+ enemyType.getSymbol()+" appears.");
                break;
            case 1:
                enemyType = EnemyType.DRAGON;
                enemyList.add(new Enemy(enemyType));
                enemy = enemyList.get(enemyList.lastIndexOf(enemyType));
                System.out.println("A "+ enemyType.getSymbol()+" appears.");
                break;
            case 2:
                enemyType = EnemyType.DWARF;
                enemyList.add(new Enemy(enemyType));
                enemy = enemyList.get(enemyList.lastIndexOf(enemyType));
                System.out.println("A "+ enemyType.getSymbol()+" appears.");
                break;
            case 3:
                enemyType = EnemyType.ELF;
                enemyList.add(new Enemy(enemyType));
                enemy = enemyList.get(enemyList.lastIndexOf(enemyType));
                System.out.println("An "+ enemyType.getSymbol()+" appears.");
                break;
            case 4:
                enemyType = EnemyType.MERCENARY;
                enemyList.add(new Enemy(enemyType));
                enemy = enemyList.get(enemyList.lastIndexOf(enemyType));
                System.out.println("A "+ enemyType.getSymbol()+" appears.");
                break;
            default:
                System.out.println("Something amazing will happen eventually");
        }
        return enemy;
    }
}
