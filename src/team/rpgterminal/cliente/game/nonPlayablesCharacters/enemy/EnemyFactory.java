package team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy;

import team.rpgterminal.cliente.game.tools.RandomNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 11/07/2017.
 */
public class EnemyFactory {


    /**
     *
     * @param enemyType
     * @param enemyQuantity
     * @return
     */
    public Enemy createEnemy(EnemyType enemyType, int enemyQuantity) {
        Enemy enemy = null;

        for (int i = 0; i < enemyQuantity; i++) {
            switch (enemyType) {
                case MONSTER:
                    enemy = new Enemy(EnemyType.MONSTER);
                    break;
                case DRAGON:
                    enemy = new Enemy(EnemyType.DRAGON);
                    break;
                case DWARF:
                    enemy = new Enemy(EnemyType.DWARF);
                    break;
                case ELF:
                    enemy = new Enemy(EnemyType.ELF);
                    break;
                case MERCENARY:
                    enemy = new Enemy(EnemyType.MERCENARY);
                    break;
                default:
                    System.out.println("There's no more enemies. Something bad really happened.");
            }
        }
        return enemy;
    }

    /**
     * It creates a intro message for a enemy type.
     *
     * @param enemyType
     */
    public void getEnemyMessage(EnemyType enemyType) {
        System.out.println("A " + enemyType.getSymbol() + " appears.");
        System.out.println("It has " + enemyType.getAttackPower() + " points of attacking power and " + enemyType.getShield() + " points of shield.");
    }


}
